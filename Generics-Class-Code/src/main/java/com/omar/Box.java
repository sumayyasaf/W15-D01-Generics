package com.omar;

public class Box<T> {
    private T value;
    Integer myNum;

    public void setValue(T newValue){
        value = newValue;
    }

    public T getValue(){
        return value;
    }

}
