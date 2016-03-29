package org.sourceit.exception;

/**
 * Created by oleg on 29.03.16.
 */
public class ReadException extends Exception {

    public ReadException() {
    }

    public ReadException(String message) {
        super(message);
    }

    public ReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
