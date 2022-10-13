package com.javaProject.javaBack.controller;


import com.javaProject.javaBack.model.Book;
import com.javaProject.javaBack.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @GetMapping(value = "/books")
    public List<Book>getAllBook(){

        return bookRepository.findAll();

    }

    @GetMapping(value = "/book/{id}")
    public Book getOne(@PathVariable long id){

        return bookRepository.findById(id).orElseThrow();

    }

    @DeleteMapping(value = "/book/{id}")
    public String deleteBook(@PathVariable long id){

        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);
        return "Book deleted with id " + id;

    }

    @PostMapping(value = "/add_book")
    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @PutMapping(value = "/update_book/{id}")
    public Book addBook(@PathVariable long id, @RequestBody Book book){
       return bookRepository.saveAndFlush(book);
    }


}
