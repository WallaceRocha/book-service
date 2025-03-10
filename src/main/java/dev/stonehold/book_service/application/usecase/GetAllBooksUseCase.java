package dev.stonehold.book_service.application.usecase;

import dev.stonehold.book_service.domain.model.Book;
import dev.stonehold.book_service.domain.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllBooksUseCase {

    private final BookRepository bookRepository;

    public List<Book> execute() {
        return bookRepository.findAll();
    }

}
