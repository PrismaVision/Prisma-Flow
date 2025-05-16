package com.prismaflow.manager.core.entity;

public record User(

        Long id,
        String name,
        String email,
        String password,
        String role

) {
}
