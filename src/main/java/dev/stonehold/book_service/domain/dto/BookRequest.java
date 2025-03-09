package dev.stonehold.book_service.domain.dto;

import java.time.LocalDate;

public record BookRequest(String title, String publisher, LocalDate startDate) {}
