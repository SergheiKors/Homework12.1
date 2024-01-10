package ru.netology.product;

public class NotFoundException extends RuntimeException {
    public NotFoundException (int id) {
        super("Товар с id = " + id + " не найден");
    }
}
