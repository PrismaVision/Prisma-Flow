package com.prismaflow.manager.core.enums;

public enum Category {
    BUG("Bug"),
    FEATURE("Feature"),
    TASK("Task"),
    REFACTOR("refactor");

    private final String description;
    Category(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
