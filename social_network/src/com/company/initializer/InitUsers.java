package com.company.initializer;

import com.company.entities.Post;
import com.company.entities.User;

import java.util.Arrays;

public class InitUsers {
    public User[] init(){
        User[] userArray = new User[5];

        userArray[0] = new User("Leslie Klein", 20, Arrays.asList(
                new Post(1, "Chuck Norris breaks RSA 128-bit encrypted codes in milliseconds.")
        ));
        userArray[1] = new User("Keri Rodriguez", 18, Arrays.asList(
                new Post(2, "You want to enjoy life, don't you? If you get your job done quickly and your job is fun, that's good isn't it? That's the purpose of life, partly. Your life is better."),
                new Post(3, "The fool doth think he is wise, but the wise man knows himself to be a fool."),
                new Post(4, "Smart people underestimate the ordinarity of ordinary people."),
                new Post(7, "Doubt that the sun doth move, doubt truth to be a liar, but never doubt I love.")

        ));
        userArray[2] = new User("Mei Boyer", 17, Arrays.asList(
                new Post(8, "It is not the responsibility of the language to force good looking code, but the language should make good looking code possible.")
        ));
        userArray[3] = new User("Alfonzo Gibson", 17, Arrays.asList(
                new Post(10, "Of course it is happening inside your head, Harry, but why on earth should that mean that it is not real?"),
                new Post(11, "Just because you have the emotional range of a teaspoon doesn’t mean we all have."),
                new Post(12, "Words are in my not-so-humble opinion, the most inexhaustible form of magic we have, capable both of inflicting injury and remedying it.")
        ));
        userArray[4] = new User("Carmelita Brown", 16, Arrays.asList(
                new Post(5, "Can one desire too much of a good thing?"),
                new Post(6, "There is nothing either good or bad, but thinking makes it so."),
                new Post(9, "How bitter a thing it is to look into happiness through another man's eyes!")
        ));
        return userArray;
    }
}
