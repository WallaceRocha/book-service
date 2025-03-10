package dev.stonehold.book_service.infrastructure.persistence.controller;

import dev.stonehold.book_service.application.usecase.CreateBookUseCase;
import dev.stonehold.book_service.application.usecase.GetAllBooksUseCase;
import dev.stonehold.book_service.application.usecase.GetBookUseCase;
import dev.stonehold.book_service.domain.dto.BookRequest;
import dev.stonehold.book_service.domain.dto.BookResponse;
import dev.stonehold.book_service.domain.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final GetBookUseCase getBookUseCase;
    private final GetAllBooksUseCase getAllBooksUseCase;
    private final CreateBookUseCase createBookUseCase;

    @GetMapping
    public ResponseEntity<List<BookResponse>> allBooks() {
        List<BookResponse> booksReponse = getAllBooksUseCase.execute()
                .stream()
                .map(BookResponse::fromDomain)
                .toList();
        return ResponseEntity.ok(booksReponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBook(@PathVariable Long id) {
        Book book = getBookUseCase.execute(id);
        return ResponseEntity.ok(BookResponse.fromDomain(book));
    }

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@RequestBody BookRequest bookRequest) {
        Book bookCreated = createBookUseCase.execute(bookRequest.toDomain());
        return ResponseEntity.ok(BookResponse.fromDomain(bookCreated));
    }


}
