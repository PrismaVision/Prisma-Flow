package com.prismaflow.manager.core.entities.board;

import com.prismaflow.manager.core.entities.column.Column;

import java.util.List;

public record Board(
        Long id,
        String name,
        List<Column> columns,
        List<Long> users
) {

    public Board {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Board name must not be empty");
        }

        if (columns == null || columns.isEmpty()) {
            throw new IllegalArgumentException("Board must have at least one column");
        }

        if (users == null || users.isEmpty()) {
            throw new IllegalArgumentException("Board must have at least one associated user");
        }


    }
}
