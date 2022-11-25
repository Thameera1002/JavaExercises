package com.java.loops;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] animal={"🐕","🐈","🐟","🐒","🦜","🦋"};

        //get every element in array using for-each
        for (String item : animal) {
            System.out.println(item);
        }
    }
}
