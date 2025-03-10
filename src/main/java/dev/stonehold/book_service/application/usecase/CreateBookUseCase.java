package dev.stonehold.book_service.application.usecase;

import dev.stonehold.book_service.domain.model.Book;
import dev.stonehold.book_service.domain.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class CreateBookUseCase {

    private final BookRepository bookRepository;

    public Book execute(Book book) {
        return bookRepository.save(book);
    }

}
