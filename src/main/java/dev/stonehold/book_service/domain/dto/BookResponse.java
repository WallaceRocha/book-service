package dev.stonehold.book_service.domain.dto;

import dev.stonehold.book_service.domain.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class BookResponse {
    private String title;
    private String publisher;
    private LocalDate startDate;

    public static BookResponse fromDomain(Book book) {
        return new BookResponse(book.getTitle(), book.getPublisher(), book.getStartDate());
    }
}
