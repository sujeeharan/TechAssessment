package com.example.demo.service.impl;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.service.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostsServiceImpl implements IPostsService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post AddPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getPostById(Integer id) {
        return postRepository.findById(id);
    }

    @Override
    public void deletePost(Integer id) {
        postRepository.deleteById(id);
    }
}
