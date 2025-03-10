package dev.stonehold.book_service.application.usecase;

import dev.stonehold.book_service.domain.model.Book;
import dev.stonehold.book_service.domain.repository.BookRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetBookUseCase {
    private final BookRepository bookRepository;

    public Book execute(Long id) {
        return bookRepository.findById(id);
    }


}
