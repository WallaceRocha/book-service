package dev.stonehold.book_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "dev.stonehold.book_service.infrastructure.persistence.entity")
public class BookServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
}
