package Inheritance;

public class Student extends  User{

    String course;

    void scheduleClass(){
        System.out.println("Student scheduled for "+ course);
    }
}
