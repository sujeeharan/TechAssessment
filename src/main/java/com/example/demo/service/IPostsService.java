package com.example.demo.service;

import com.example.demo.entity.Post;

import java.util.List;
import java.util.Optional;

public interface IPostsService {
    Post AddPost(Post post);
    List<Post> getAllPost();
    Optional<Post> getPostById(Integer id);

    void deletePost(Integer id);
}
