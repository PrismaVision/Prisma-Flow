package com.prismaflow.manager.core.entities.column;

import java.util.List;

public record Column(
        Long id,
        String name,
        int position,
        List<Long> cardIds
) {

    public Column {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Column name must not be empty");
        }

        if (position < 0) {
            throw new IllegalArgumentException("Column position must be non-negative");
        }

        if (cardIds == null) {
            throw new IllegalArgumentException("cardIds must not be null (can be empty)");
        }
    }

}
