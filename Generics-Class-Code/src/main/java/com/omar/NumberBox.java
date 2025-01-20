package com.omar;

public class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T newNum){
        number = newNum;
    }

    public T getNumber(){
        return number;
    }

    public double convertToDouble(){
        return number.doubleValue();
    }
}
