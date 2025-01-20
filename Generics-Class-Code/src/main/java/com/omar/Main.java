package com.omar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {


        String myStudent = "Mihai";

        System.out.println(myStudent);

        ArrayList<String> myStudents = new ArrayList<>();

        myStudents.add(myStudent);

        String student = (String)myStudents.get(0);

        System.out.println(myStudents);

        Box<String> stringBox = new Box<>();

        stringBox.setValue("New Value");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();

        System.out.println(integerBox.getValue());


        NumberBox numberBox = new NumberBox();

        numberBox.setNumber(10);

        System.out.println(numberBox.getNumber());

        System.out.println(numberBox.convertToDouble());


//        wildcard
        ArrayList<?> myNumsAL = new ArrayList<>(Arrays.asList(1,"Maryam",false));


        System.out.println(myNumsAL);


        ExerciseBox<ArrayList<Integer>,Integer> myExerciseBox = new ExerciseBox<>();

        myExerciseBox.setValue(new ArrayList<>(Arrays.asList(1,2,4,4)));
        System.out.println(myExerciseBox.getValue());


        List<Integer> myInts = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Number> myNums =  new ArrayList<>(Arrays.asList(1,2,32,44,55));

        printElements(myInts);
        printElements(myNums);

        List<Number> nums2 = new ArrayList<>();

        int newNum = 10;

        addElementToList(nums2,newNum);

        printList(myNums);




    }

    public static <T> void printElements(List<? extends T> list){
        for(T element : list){
            System.out.println(element);
        }
    }

    public static <T> void addElementToList(List<? super T> list, T element){

        list.add(element);
        System.out.println("Added new element: " + element);
    }

    public static void printList(List<?> list){
        for(Object element : list){
            System.out.println("item: " + element);
        }
    }

}