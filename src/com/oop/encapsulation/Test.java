package com.oop.encapsulation;

public class Test {
    public static void main(String[] args) {
        //create student class object to access student class methods
        Student student = new Student();

        //set data to Student class variables via its set methods
        student.setStdID("S001");
        student.setStdName("Amal");
        student.setStdAddress("Colombo");
        student.setStdGrade("11");
        student.setScienceMark(65);
        student.setMathsMarks(75);
        student.setEnglishMarks(85);

        //to print this data, we can use get methods in Student class and also toString() method.
        System.out.println(
                "Student ID :"+student.getStdID()+"\n"+
                "Student Name :"+student.getStdName()+"\n"+
                "Student Address :"+student.getStdAddress()+"\n"+
                "Student Grade :"+student.getStdGrade()+"\n"+
                "Student Science Mark :"+student.getScienceMark()+"\n"+
                "Student Maths Mark :"+student.getMathsMarks()+"\n"+
                "Student English Mark :"+student.getEnglishMarks()
        );

        System.out.println("========================");

        System.out.println(student.toString());;

    }
}
