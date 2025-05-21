package com.prismaflow.manager.core.entities.card;

import com.prismaflow.manager.core.enums.CardProgress;
import com.prismaflow.manager.core.enums.Category;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record Card(
        Long id,
        String title,
        String description,
        LocalDateTime creationDate,
        LocalDateTime completionDate,
        LocalDate expirationDate,
        LocalDateTime lastChange,
        List<Long> users,
        CardProgress progress,
        Category category
) {

    public Card {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title must not be empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description must not be empty");
        }
        if (creationDate == null) {
            throw new IllegalArgumentException("Creation date must not be null");
        }
        if (expirationDate != null && expirationDate.isBefore(creationDate.toLocalDate())) {
            throw new IllegalArgumentException("Expiration date cannot be before creation date");
        }
    }

}
