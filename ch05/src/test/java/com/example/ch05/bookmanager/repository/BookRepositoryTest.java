package com.example.ch05.bookmanager.repository;


import com.example.ch05.bookmanager.doamin.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void bookTest() {
        Book book = new Book();

        book.setName("논리적으로 말하는");
        book.setAuthor("people");

        bookRepository.save(book);

        System.out.println(bookRepository.findAll());
    }
}
