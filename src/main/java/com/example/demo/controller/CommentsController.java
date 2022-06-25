package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api")
public class CommentsController {

    @Autowired
    ICommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments(){
        return commentService.getAllComments();

    }

    @GetMapping(value = "/comment")
    public Optional<Comment> getById(@RequestParam Integer id){
        return commentService.getCommentsbyId(id);
    }

    @PostMapping("/comment")
    public Comment addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }

    @PutMapping("/comment")
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }


    @DeleteMapping("/comment")
    public void deleteComment(@RequestParam Integer id){
        commentService.deleteComment(id);
    }

}
