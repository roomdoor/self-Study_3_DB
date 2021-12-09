package com.example.ch07.bookmanager.bookmanager.service;

import com.example.ch07.bookmanager.doamin.Book;
import com.example.ch07.bookmanager.repository.AuthorRepository;
import com.example.ch07.bookmanager.repository.BookRepository;
import com.example.ch07.bookmanager.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void transactionTest() {
        try {
            bookService.putBookAndAuthor();
        } catch (RuntimeException e) {
            System.out.println(">>> " + e.getMessage());
        }

        System.out.println("book : " + bookRepository.findAll());
        System.out.println("authors : " + authorRepository.findAll());
    }

    @Test
    void isolationTest() {

        Book book = new Book();
        book.setName("JPA class");

        bookRepository.save(book);

        bookService.get(1L);
        System.out.println(">>>> " + bookRepository.findAll());
    }

}