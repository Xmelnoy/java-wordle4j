package ru.yandex.practicum.exception;

public class WordNotFoundExceptions extends GameException {
    public WordNotFoundExceptions(String word) {
        super("Слово - " + word + " не найдено!");
    }
}
