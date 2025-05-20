package com.prismaflow.manager.core.task;

public enum TaskStatus {

    TODO("Todo"),
    IN_PROGRESS("In Progress"),
    DONE("Done");

    private final String description;
    TaskStatus(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
