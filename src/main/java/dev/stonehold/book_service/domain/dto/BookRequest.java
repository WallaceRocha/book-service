package dev.stonehold.book_service.domain.dto;

import dev.stonehold.book_service.domain.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BookRequest {
    private String title;
    private String publisher;
    private LocalDate startDate;

    public Book toDomain() {
        return new Book(title, publisher, startDate);
    }
}
