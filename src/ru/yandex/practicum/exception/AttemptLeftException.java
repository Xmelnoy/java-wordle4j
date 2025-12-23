package ru.yandex.practicum.exception;

public class AttemptLeftException extends GameException {
    public AttemptLeftException() {
        super("Попытки закончились.");
    }

}
