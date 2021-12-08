package com.example.ch07.bookmanager.service;

import com.example.ch07.bookmanager.doamin.Author;
import com.example.ch07.bookmanager.doamin.Book;
import com.example.ch07.bookmanager.repository.AuthorRepository;
import com.example.ch07.bookmanager.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public void putBookAndAuthor() {
        Book book = new Book();
        book.setName("JPA 시작하기");

        bookRepository.save(book);

        Author author = new Author();
        author.setName("martin");

        authorRepository.save(author);
    }
}
