package com.oop.encapsulation;

public class Student {

    //initialize variables
    private String stdID;
    private String stdName;
    private String stdAddress;
    private String stdGrade;
    private double scienceMark;
    private double mathsMarks;
    private double englishMarks;


    //generate getters and setters to get and set data for relevant variables
    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }

    public String getStdGrade() {
        return stdGrade;
    }

    public void setStdGrade(String stdGrade) {
        this.stdGrade = stdGrade;
    }

    public double getScienceMark() {
        return scienceMark;
    }

    public void setScienceMark(double scienceMark) {
        this.scienceMark = scienceMark;
    }

    public double getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(double mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public double getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(double englishMarks) {
        this.englishMarks = englishMarks;
    }

    //override toString() method
    @Override
    public String toString() {
        return "Student{" +
                "stdID='" + stdID + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdAddress='" + stdAddress + '\'' +
                ", stdGrade='" + stdGrade + '\'' +
                ", scienceMark=" + scienceMark +
                ", mathsMarks=" + mathsMarks +
                ", englishMarks=" + englishMarks +
                '}';
    }
}
