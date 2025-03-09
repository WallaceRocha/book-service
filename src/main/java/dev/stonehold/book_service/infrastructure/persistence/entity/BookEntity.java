package dev.stonehold.book_service.infrastructure.persistence.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "books")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "book_id"))
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(length = 60)
    private String publisher;

    @Column(nullable = false)
    private LocalDate startDate;

}
