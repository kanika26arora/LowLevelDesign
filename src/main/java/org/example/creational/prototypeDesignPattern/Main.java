package org.example.creational.prototypeDesignPattern;

public class Main {

    public static void main(String... s){

        MyStudent myStudent = new MyStudent(28, "kan", 12);

        //here you cannot make the exact clone because mystudent's fields are private and there are no getters so you cannot get mystudent.getName()
        //so you call clone method
        //MyStudent myStudent2 = new MyStudent();

        MyStudent myStudentClone = myStudent.myClone();

        System.out.println(myStudent);
        System.out.println(myStudentClone);
    }
}
