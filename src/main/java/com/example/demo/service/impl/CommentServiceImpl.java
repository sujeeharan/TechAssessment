package com.example.demo.service.impl;

import com.example.demo.entity.Comment;
import com.example.demo.repository.CommentRepository;
import com.example.demo.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> getCommentsbyId(Integer id) {
        return commentRepository.findById(id);
    }

    @Override
    public void deleteComment(Integer id) {
        commentRepository.deleteById(id);
    }
}
