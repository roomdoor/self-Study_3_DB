package com.example.ch09.bookmanager.bookmanager.repository;

import com.example.ch09.bookmanager.doamin.Author;
import com.example.ch09.bookmanager.doamin.Book;
import com.example.ch09.bookmanager.doamin.BookAndAuthor;
import com.example.ch09.bookmanager.repository.AuthorRepository;
import com.example.ch09.bookmanager.repository.BookAndAuthorRepository;
import com.example.ch09.bookmanager.repository.BookRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
class AuthorRepositoryTest {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookAndAuthorRepository bookAndAuthorRepository;

    @Test
    void manyToMany() {

        Book book1 = givenBook("책1");
        Book book2 = givenBook("책2");
        Book book3 = givenBook("개발책1");
        Book book4 = givenBook("개발책2");
        ;

        Author author1 = givenAuthor("시화");
        Author author2 = givenAuthor("화시");
//
//        book1.addAuthor(author1);
//        book2.addAuthor(author2);
//
//        book3.addAuthor(author1, author2);
//
//        book4.addAuthor(author1, author2);
//
//
//        author1.addBook(book1, book2, book3);
//        author2.addBook(book2, book3, book4);

        BookAndAuthor bookAndAuthor1 = givenBookAndAuthor(book1, author1);
        BookAndAuthor bookAndAuthor2 = givenBookAndAuthor(book2, author2);
        BookAndAuthor bookAndAuthor3 = givenBookAndAuthor(book3, author1);
        BookAndAuthor bookAndAuthor4 = givenBookAndAuthor(book3, author2);
        BookAndAuthor bookAndAuthor5 = givenBookAndAuthor(book4, author1);
        BookAndAuthor bookAndAuthor6 = givenBookAndAuthor(book4, author2);


        bookRepository.saveAll(Lists.newArrayList(book1, book2, book3, book4));
        authorRepository.saveAll(Lists.newArrayList(author1, author2));

//        System.out.println("author through book : " + bookRepository.findAll().get(2).getAuthors());
//        System.out.println("book through author : " + authorRepository.findAll().get(1).getBooks());

        book1.addBookAndAuthor(bookAndAuthor1);
        book2.addBookAndAuthor(bookAndAuthor2);
        book3.addBookAndAuthor(bookAndAuthor3, bookAndAuthor4);
        book4.addBookAndAuthor(bookAndAuthor5, bookAndAuthor6);

        author1.addBookAndAuthor(bookAndAuthor1, bookAndAuthor3, bookAndAuthor5);
        author2.addBookAndAuthor(bookAndAuthor2, bookAndAuthor4, bookAndAuthor6);


        bookRepository.findAll().get(2).getBookAndAuthors().forEach(o -> System.out.println(o.getAuthor()));

        authorRepository.findAll().get(0).getBookAndAuthors().forEach(o -> System.out.println(o.getBook()));
    }



    private BookAndAuthor givenBookAndAuthor(Book book, Author author) {
        BookAndAuthor bookAndAuthor = new BookAndAuthor();
        bookAndAuthor.setBook(book);
        bookAndAuthor.setAuthor(author);

        return bookAndAuthorRepository.save(bookAndAuthor);
    }

    private Book givenBook(String name) {
        Book book = new Book();
        book.setName(name);
        return bookRepository.save(book);
    }

    private Author givenAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        return authorRepository.save(author);
    }

}