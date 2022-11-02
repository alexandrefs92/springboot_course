package com.educandoweb.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 4264470429498806113L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
