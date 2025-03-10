package dev.stonehold.book_service.domain.repository;

import dev.stonehold.book_service.domain.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);
    Book findById(Long id);
    List<Book> findAll();
}
