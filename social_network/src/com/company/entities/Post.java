package com.company.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Post implements Serializable {
    int id;
    String content;
    List<User> likedByList;

    public Post(int id, String content, List<User> likedByList) {
        this.id = id;
        this.content = content;
        this.likedByList = likedByList;
    }

    public Post(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<User> getLikedByList() {
        return likedByList;
    }

    public void setLikedByList(List<User> likedByList) {
        this.likedByList = likedByList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id &&
                content.equals(post.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    @Override
    public String toString() {
        return "\nPost{ " +
                "id: " + id +
                ", content: '" + content + '\'' +
                " }";
    }

    public String toString(boolean b){
        StringBuilder s = new StringBuilder();
        s.append("\nPost{ id: " + id + ", content: '" + content + '\'');
        likedByList.forEach(user -> s.append(user.toString(true)));
        return s.toString();
    }
}
