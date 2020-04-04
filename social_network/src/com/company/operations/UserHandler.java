package com.company.operations;

import com.company.entities.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserHandler {
    public boolean moreThanGiven(User[] users){
        Stream<User> usersStream = Arrays.stream(users).parallel();
        usersStream = usersStream.filter(us -> us.getPosts().size() > 300);

        Optional<User> answer = usersStream.findAny();
        return answer.isPresent();
    }

    public User maxPosts(User[] users){
        Stream<User> usersStream = Arrays.stream(users).parallel();
        Optional<User> optUser = usersStream.max(User::compareByPosts);
        return optUser.orElseGet(() -> (User) new Object());
    }

    public User minPosts(User[] users){
        Stream<User> usersStream = Arrays.stream(users).parallel();
        Optional<User> optUser = usersStream.min(User::compareByPosts);
        return optUser.orElseGet(() -> (User) new Object());
    }

    public List<User> singlePost(User[] users){
        Stream<User> usersStream = Arrays.stream(users);
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
