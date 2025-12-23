package ru.yandex.practicum.exception;

public class GameException extends RuntimeException {
    public GameException(String message) {
        super(message);
    }
}