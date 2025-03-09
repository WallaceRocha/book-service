package dev.stonehold.book_service.infrastructure.mapper;

import dev.stonehold.book_service.domain.model.Book;
import dev.stonehold.book_service.infrastructure.persistence.entity.BookEntity;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookEntity toEntity(Book book) {
        return new BookEntity(book.getTitle(), book.getPublisher(), book.getStartDate());
    }

    public Book toDomain(BookEntity bookEntity) {
        return new Book(bookEntity.getTitle(), bookEntity.getPublisher(), bookEntity.getStartDate());
    }
}
