package com.educandoweb.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 7588023717060956015L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
