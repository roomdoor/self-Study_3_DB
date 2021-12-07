package com.example.ch06.bookmanager.repository;

import com.example.ch06.bookmanager.doamin.Book;
import com.example.ch06.bookmanager.doamin.BookReviewInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookReviewInfoRepositoryTest {

    @Autowired
    private BookReviewInfoRepository bookReviewInfoRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void crud() {
        giveBookReviewInfo();
    }

    @Test
    void crud2() {
        giveBookReviewInfo();

        Book result = bookReviewInfoRepository
                .findById(1L)
                .orElseThrow(RuntimeException::new)
                .getBook();

        System.out.println(">>>> " + result);

        BookReviewInfo result2 = bookRepository
                .findById(2L)
                .orElseThrow(RuntimeException::new)
                .getBookReviewInfo();

        System.out.println(">>>>> " + result2);
    }

    private Book giveBook() {
        Book book = new Book();
        book.setName("Jpa 초격차 패키지");
        book.setAuthorId(1L);
//        book.setPublisherId(1L);
        return bookRepository.save(book);
    }

    private void giveBookReviewInfo() {
        BookReviewInfo bookReviewInfo = new BookReviewInfo();
        bookReviewInfo.setBook(giveBook());
        bookReviewInfo.setAverageReviewScore(4.5f);
        bookReviewInfo.setReviewCount(2);

        bookReviewInfoRepository.save(bookReviewInfo);

        System.out.println(">>>>> " + bookReviewInfoRepository.findAll());
    }
}