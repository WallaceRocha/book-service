package dev.stonehold.book_service.infrastructure.persistence.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "user_id"))
})
@Getter
@Setter
public class UserEntity extends BaseEntity {
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
}
