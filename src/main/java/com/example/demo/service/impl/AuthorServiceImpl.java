package com.example.demo.service.impl;

import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements IAuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> getAuthorById(Integer id) {
        return authorRepository.findById(id);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);
    }
}
