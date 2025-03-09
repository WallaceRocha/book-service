package dev.stonehold.book_service.infrastructure.configuration;

import dev.stonehold.book_service.application.usecase.BookUseCase;
import dev.stonehold.book_service.domain.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public BookUseCase bookUseCase(BookRepository bookRepository) {
        return new BookUseCase(bookRepository);
    }
}
