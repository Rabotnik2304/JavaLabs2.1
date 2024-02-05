package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(new Post("Здравствуйте"));
        posts.add(new Post("Кто вы?"));
        posts.add(new Post("ДО свидания"));
        return posts;
    }
}
