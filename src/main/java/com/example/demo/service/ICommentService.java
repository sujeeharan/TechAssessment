package com.example.demo.service;

import com.example.demo.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface ICommentService {
    public Comment addComment(Comment comment);
    public List<Comment> getAllComments();
    public Optional<Comment> getCommentsbyId(Integer id);

    void deleteComment(Integer id);
}
