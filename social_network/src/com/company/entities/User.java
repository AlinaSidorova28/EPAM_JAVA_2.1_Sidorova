package com.company.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class User implements Comparable, Serializable{
    String name;
    int age;
    List<Post> posts;

    public User(String name, int age, List<Post> posts) {
        this.name = name;
        this.age = age;
        this.posts = posts;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "\nUser{ " +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", post amount: " + posts.size() +
                " }";
    }

    public String toString(boolean b) {
        return "\nUser{ " +
                "name: '" + name + '\'' +
                ", age: " + age +
                " }";
    }

    public int compareByPosts(User u) {
        return this.posts.size() - u.getPosts().size();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
