package com.pcs.trainnning.crud.entity;
/*
{
    "name": "Rohit",
    "address": "Mumbai",
    "standard": "12",
    "rollNumber": 99
}
 */
public class Student {
    private String name;
    private String address;
    private String standard;
    private int rollNumber;

    public Student(String name, String address, String standard, int rollNumber) {
        this.name = name;
        this.address = address;
        this.standard = standard;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getStandard() {
        return standard;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", standard='" + standard + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
