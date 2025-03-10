package dev.stonehold.book_service.infrastructure.configuration;

import dev.stonehold.book_service.application.usecase.CreateBookUseCase;
import dev.stonehold.book_service.application.usecase.GetAllBooksUseCase;
import dev.stonehold.book_service.application.usecase.GetBookUseCase;
import dev.stonehold.book_service.domain.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookUseCaseConfig {

    @Bean
    public CreateBookUseCase createBookUseCase(BookRepository bookRepository) {
        return new CreateBookUseCase(bookRepository);
    }

    @Bean
    public GetAllBooksUseCase getAllBooksUseCase(BookRepository bookRepository) {
        return new GetAllBooksUseCase(bookRepository);
    }

    @Bean
    public GetBookUseCase getBookUseCase(BookRepository bookRepository) {
        return new GetBookUseCase(bookRepository);
    }
}
