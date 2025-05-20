package com.prismaflow.manager.core.entities.user;

public record User(
        
        Long id,
        String name,
        String email,
        String password,
        UserRole role
) {
}
