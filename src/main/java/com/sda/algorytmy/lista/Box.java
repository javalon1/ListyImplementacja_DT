package com.sda.algorytmy.lista;

public class Box<T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
