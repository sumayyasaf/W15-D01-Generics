package com.omar;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    @Deprecated
    @SuppressWarnings("Checked")
    public String toString() {
        return "GenericClass{" +
                "value=" + value +
                '}';
    }
}
