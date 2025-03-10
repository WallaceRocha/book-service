package dev.stonehold.book_service.infrastructure.persistence.repository;

import dev.stonehold.book_service.domain.model.Book;
import dev.stonehold.book_service.domain.repository.BookRepository;
import dev.stonehold.book_service.infrastructure.exception.NotFoundException;
import dev.stonehold.book_service.infrastructure.mapper.BookMapper;
import dev.stonehold.book_service.infrastructure.persistence.entity.BookEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaBookRepository implements BookRepository {
    private final SpringDataBookRepository repository;
    private final BookMapper mapper;

    public JpaBookRepository(SpringDataBookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Book save(Book book) {
        BookEntity bookCreated = repository.save(mapper.toEntity(book));
        return mapper.toDomain(bookCreated);
    }

    @Override
    public Book findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDomain)
                .orElseThrow(() -> new NotFoundException("Book not found"));
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
