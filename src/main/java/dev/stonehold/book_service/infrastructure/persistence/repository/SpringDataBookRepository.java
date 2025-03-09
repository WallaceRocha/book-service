package dev.stonehold.book_service.infrastructure.persistence.repository;

import dev.stonehold.book_service.infrastructure.persistence.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBookRepository extends JpaRepository<BookEntity, Long> {

}
