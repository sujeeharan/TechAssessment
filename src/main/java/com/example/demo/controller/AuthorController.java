package com.example.demo.controller;


import com.example.demo.entity.Author;
import com.example.demo.entity.Post;
import com.example.demo.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    IAuthorService authorService;


    @GetMapping("/authors")
    public List<Author> getAuthor(){
        return authorService.getAllAuthors();
    }

    @GetMapping(value = "/author")
    public Optional<Author> getById(@RequestParam Integer id){

        return authorService.getAuthorById(id);
    }

    @GetMapping("/author/{id}/posts")
    public List<Post> getPostsByAuthor(@RequestParam Integer id){

        return authorService.getAuthorById(id).get().getPostList();
    }

    @PostMapping("/author")
    public Author addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @PutMapping("/author")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }


    @DeleteMapping("/author")
    public void deleteAuthor(@RequestParam Integer id){
        authorService.deleteAuthor(id);
    }
}
