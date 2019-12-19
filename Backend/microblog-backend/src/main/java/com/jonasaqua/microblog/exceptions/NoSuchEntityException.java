package com.jonasaqua.microblog.exceptions;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public class NoSuchEntityException extends RuntimeException {
    NoSuchEntityException(String message) {
        super(message);
    }

    NoSuchEntityException(String entityName, Object entityId) {
        super(String.format("%s with ID '%s' not found!", entityName, Objects.toString(entityId)));
    }
}
