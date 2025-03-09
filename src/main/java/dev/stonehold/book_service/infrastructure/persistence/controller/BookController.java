package dev.stonehold.book_service.infrastructure.persistence.controller;

import dev.stonehold.book_service.application.usecase.BookUseCase;
import dev.stonehold.book_service.domain.dto.BookRequest;
import dev.stonehold.book_service.domain.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final BookUseCase useCase;

    @GetMapping
    public ResponseEntity<List<Book>> allBooks() {
        List<Book> books = useCase.findAll();
        return ResponseEntity.ok().body(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findBook(@PathVariable Long id) {
        Book book = useCase.findById(id);
        return ResponseEntity.ok().body(book);
    }

    @PostMapping
    public ResponseEntity<Void> saveBook(@RequestBody BookRequest bookRequest) {
        useCase.saveBook(bookRequest.title(), bookRequest.publisher(), bookRequest.startDate());
        return ResponseEntity.ok().build();
    }


}
