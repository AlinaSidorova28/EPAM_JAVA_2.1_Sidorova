package com.company.operations;

import com.company.entities.Post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PostHandler {
    public void printPosts(Post[] posts){
        List<Post> postsList = Arrays.asList(posts);
        postsList.forEach(post -> System.out.println(post.toString(true)));
    }

    public ArrayList<Post> cutDuplicates(Post[] posts){
        Stream<Post> postStream = Arrays.stream(posts);
        return postStream.distinct().collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<String> getPostsList(Post[] posts){
        Stream<Post> postStream = Arrays.stream(posts).parallel();
        return postStream.map(p -> p.getContent()).collect(Collectors.toCollection(ArrayList::new));
    }
}
