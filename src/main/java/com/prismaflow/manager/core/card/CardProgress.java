package com.prismaflow.manager.core.card;

public enum CardProgress {

    TODO("Todo"),
    IN_PROGRESS("In Progress"),
    DONE("Done");

    private final String description;
    CardProgress(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
