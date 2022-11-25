package com.java.conditions;

public class IfConditionPractice {

    public static void main(String[] args) {

        //initialize string array to store animals
        String[] animal={"🐕","🐈","🐟","🐒","🦜","🦋"};

        //check first index of the array.
        if(animal[0]=="🐕"){
            System.out.println("This is dog. 🐕");
        }

        //check first index of the array.
        if(animal[0]=="🐈"){
            System.out.println("This is cat. 🐈");
        } else if (animal[0]=="🐟") {
            System.out.println("This is fish. 🐟");
        }else {
            System.out.println("This is dog. 🐕");
        }

        //single line if statement
        int x=10;
        int y = 20;
        int max=0;
        max = (x>y) ? x:y;
        System.out.println("Max value is "+max);


    }
}
