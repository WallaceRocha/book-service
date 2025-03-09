package dev.stonehold.book_service.infrastructure.persistence.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "book_reviews")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "review_id"))
})
@Getter
@Setter
public class ReviewEntity extends BaseEntity {

    @Column(nullable = false)
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookEntity book;

    @Column(nullable = false)
    private int rating;

}
