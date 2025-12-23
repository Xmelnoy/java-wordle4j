package ru.yandex.practicum.exception;

public class SystemExceptions extends RuntimeException {
    public SystemExceptions(String message) {
        super(message);
    }

    public SystemExceptions(String message, Throwable throwable) {
        super(message, throwable);
    }
}
