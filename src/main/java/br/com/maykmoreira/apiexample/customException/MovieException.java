package br.com.maykmoreira.apiexample.customException;

public class MovieException extends Exception {
    public MovieException(String message) {
        super(message);
    }

    public MovieException(String message, Throwable cause) {
        super(message, cause);
    }
}
