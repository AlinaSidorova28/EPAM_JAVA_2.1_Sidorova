package com.company;

import com.company.entities.Post;
import com.company.entities.User;
import com.company.initializer.InitPosts;
import com.company.initializer.InitUsers;
import com.company.operations.PostHandler;
import com.company.operations.UserHandler;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;


public class Main {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("Start");
        InitUsers initUsers = new InitUsers();
        InitPosts initPosts = new InitPosts();

        User[] userArray = initUsers.init();
        Post[] postArray = initPosts.init();

        /*Faker faker = new Faker();
        for(int i=0; i<10; i++){
            System.out.println(faker.harryPotter().quote());
        }*/
        UserHandler userHandler = new UserHandler();
        System.out.println("\nAre there users with more than 300 posts: " + userHandler.moreThanGiven(userArray));
        System.out.println("\nUser with max amount of posts: " + userHandler.maxPosts(userArray));
        System.out.println("\nUser with min amount of posts: " + userHandler.minPosts(userArray));
        System.out.println("\nUsers with a single post: ");
        System.out.println(userHandler.singlePost(userArray));
        System.out.println("\nUsers sorted by age and amount of posts: ");
        System.out.println(userHandler.sort(userArray));

        PostHandler postHandler = new PostHandler();
        System.out.println("\nAll posts: ");
        //System.out.println(postHandler.getPostsList(postArray));
        for(String s : postHandler.getPostsList(postArray)){
            System.out.println(s);
        }
        System.out.println("\nInformation about posts: ");
        postHandler.printPosts(postArray);
        System.out.println("\nPosts without duplicates: ");
        System.out.println(postHandler.cutDuplicates(postArray) + "\n");

        logger.info("Finish");
    }
}
