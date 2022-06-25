package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.IPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    IPostsService postsService;

    @GetMapping("/posts")
    public List<Post> getPost(){
        return postsService.getAllPost();
    }

    @GetMapping(value = "/post")
    public Optional<Post> getById(@RequestParam Integer id){
        return postsService.getPostById(id);
    }

    @GetMapping("/post/{id}/comments")
    public Post getCommentsforPost(){
        Post post = new Post();
        return post;
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return postsService.AddPost(post);
    }


    @PutMapping
    public Post updatePost(@RequestBody Post post){
        return postsService.AddPost(post);
    }

    @DeleteMapping("/post")
    public void deletePost(@RequestParam Integer id){
        postsService.deletePost(id);
    }

}
