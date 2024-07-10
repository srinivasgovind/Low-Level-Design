package Polymorphism;

public class Student extends User {

    String university;
    String batch;
    String course;

    void scheduleClass(){
        System.out.println("Student scheduled for "+ course);
    }
}
