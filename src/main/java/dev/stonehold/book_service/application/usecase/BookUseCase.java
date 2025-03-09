package dev.stonehold.book_service.application.usecase;

import dev.stonehold.book_service.domain.model.Book;
import dev.stonehold.book_service.domain.repository.BookRepository;

import java.time.LocalDate;
import java.util.List;

public class BookUseCase {

    private final BookRepository bookRepository;

    public BookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(String title, String publisher, LocalDate startDate) {
        Book book = new Book(title, publisher, startDate);
        bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }
}
