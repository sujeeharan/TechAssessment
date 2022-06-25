package com.example.demo.service;

import com.example.demo.entity.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {

    public Author addAuthor(Author author);
    public List<Author> getAllAuthors();
    public Optional<Author> getAuthorById(Integer id);

    void deleteAuthor(Integer id);
}
