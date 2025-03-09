package dev.stonehold.book_service.domain.model;
import java.time.LocalDate;

public class Book {
    private String title;
    private String publisher;
    private LocalDate startDate;


    public Book(String title, String publisher, LocalDate startDate) {
        this.title = title;
        this.publisher = publisher;
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
