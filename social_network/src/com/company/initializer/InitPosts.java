package com.company.initializer;


import com.company.entities.Post;
import com.company.entities.User;

import java.util.Arrays;

public class InitPosts {
    public Post[] init(){
        Post[] postArray = new Post[15];

        postArray[0] = new Post(1, "Chuck Norris breaks RSA 128-bit encrypted codes in milliseconds.",
                Arrays.asList(new User("Mei Boyer", 17),
                        new User("Alfonzo Gibson", 17)));
        postArray[1] = new Post(2, "You want to enjoy life, don't you? If you get your job done quickly and your job is fun, that's good isn't it? That's the purpose of life, partly. Your life is better.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Mei Boyer", 17),
                        new User("Carmelita Brown", 16)));
        postArray[2] = new Post(3, "The fool doth think he is wise, but the wise man knows himself to be a fool.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Carmelita Brown", 16)));
        postArray[3] = new Post(4, "Smart people underestimate the ordinarity of ordinary people.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Mei Boyer", 17),
                        new User("Alfonzo Gibson", 17),
                        new User("Carmelita Brown", 16)));
        postArray[4] = new Post(5, "Can one desire too much of a good thing?",
                Arrays.asList(new User("Mei Boyer", 17)));
        postArray[5] = new Post(6, "There is nothing either good or bad, but thinking makes it so.",
                Arrays.asList(new User("Keri Rodriguez", 18),
                        new User("Alfonzo Gibson", 17)));
        postArray[6] = new Post(3, "The fool doth think he is wise, but the wise man knows himself to be a fool.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Alfonzo Gibson", 17),
                        new User("Carmelita Brown", 16)));
        postArray[7] = new Post(7, "Doubt that the sun doth move, doubt truth to be a liar, but never doubt I love.",
                Arrays.asList(new User("Alfonzo Gibson", 17)));
        postArray[8] = new Post(8, "It is not the responsibility of the language to force good looking code, but the language should make good looking code possible.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Alfonzo Gibson", 17)));
        postArray[9] = new Post(6, "There is nothing either good or bad, but thinking makes it so.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Keri Rodriguez", 18),
                        new User("Alfonzo Gibson", 17)));
        postArray[10] = new Post(9, "How bitter a thing it is to look into happiness through another man's eyes!",
                Arrays.asList(new User("Keri Rodriguez", 18),
                        new User("Alfonzo Gibson", 17)));
        postArray[11] = new Post(10, "Of course it is happening inside your head, Harry, but why on earth should that mean that it is not real?",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Keri Rodriguez", 18),
                        new User("Mei Boyer", 17),
                        new User("Carmelita Brown", 16)));
        postArray[12] = new Post(6, "There is nothing either good or bad, but thinking makes it so.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Alfonzo Gibson", 17)));
        postArray[13] = new Post(11, "Just because you have the emotional range of a teaspoon doesn’t mean we all have.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Keri Rodriguez", 18),
                        new User("Mei Boyer", 17),
                        new User("Carmelita Brown", 16)));
        postArray[14] = new Post(12, "Words are in my not-so-humble opinion, the most inexhaustible form of magic we have, capable both of inflicting injury and remedying it.",
                Arrays.asList(new User("Leslie Klein", 20),
                        new User("Keri Rodriguez", 18),
                        new User("Mei Boyer", 17),
                        new User("Carmelita Brown", 16)));
        return postArray;
    }
}
