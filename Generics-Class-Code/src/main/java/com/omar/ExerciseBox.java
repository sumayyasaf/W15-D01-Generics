package com.omar;

import java.util.List;

public class ExerciseBox<T extends List<S>,S> {
    private T value;
    Integer myNum;

    public void setValue(T newValue){
        value = newValue;
    }

    public T getValue(){
        return value;
    }
}
