package com.prismaflow.manager.core.entities.user;

import com.prismaflow.manager.core.enums.UserRole;

public record User(
        Long id,
        String name,
        String email,
        String password,
        UserRole role
) {
}
