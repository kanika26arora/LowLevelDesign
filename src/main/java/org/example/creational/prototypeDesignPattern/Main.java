package org.example.creational.prototypeDesignPattern;

public class Main {

    public static void main(String... s){

        MyStudent myStudent = new MyStudent(1, "Kanika", 28);

        MyStudent myStudentClone = myStudent.myClone();

        myStudentClone.name = "Pari";

        System.out.println(myStudent);
        System.out.println(myStudentClone);
    }
}
