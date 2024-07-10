package Inheritance;

public class Client {

    public static void main(String[] args) {

            Instructor instructor = new Instructor();

            instructor.username = "John";
//            instructor.password = "john";

            instructor.login();

            Student student = new Student();
            student.username = "John";
//            student.password = "john";
            student.login();
            student.scheduleClass();
    }
}
