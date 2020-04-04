package com.company.operations;

import com.company.entities.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserHandler {
    static Logger logger = LogManager.getLogger();
    public boolean moreThanGiven(User[] users){
        Stream<User> usersStream = Arrays.stream(users).parallel();
        usersStream = usersStream.filter(us -> us.getPosts().size() > 300);
        Optional<User> answer = usersStream.findAny();

        return answer.isPresent();
    }

    public User maxPosts(User[] users){
        long start = System.currentTimeMillis();
        Stream<User> usersStream = Arrays.stream(users);
        Optional<User> optUser = usersStream.max(User::compareByPosts);

        long timeSpent = System.currentTimeMillis() - start;
        logger.info("Time spent with simple stream: " + timeSpent + " milliseconds");
        return optUser.orElseGet(() -> (User) new Object());
    }

    public User minPosts(User[] users){
        long start = System.currentTimeMillis();
        Stream<User> usersStream = Arrays.stream(users).parallel();
        Optional<User> optUser = usersStream.min(User::compareByPosts);

        long timeSpent = System.currentTimeMillis() - start;
        logger.info("Time spent with parallel stream: " + timeSpent + " milliseconds");
        return optUser.orElseGet(() -> (User) new Object());
    }

    public List<User> singlePost(User[] users){
        Stream<User> usersStream = Arrays.stream(users).parallel();
        usersStream = usersStream.peek(u -> System.out.println("Filtrated user: " + u.getName() + ", posts: " + u.getPosts().size()))
                                 .filter(u -> u.getPosts().size() == 1);

        Optional<List<User>> new_users = Optional.of(usersStream.collect(Collectors.toList()));
        return  new_users.orElse(Collections.EMPTY_LIST);
    }

    public ArrayList<User> sort(User[] users) {
        Stream<User> usersStream = Arrays.stream(users).parallel();
        return usersStream.sorted(Comparator.comparing(User::getAge).thenComparing(User::compareByPosts))
                          .collect(Collectors.toCollection(ArrayList::new));
    }
}
