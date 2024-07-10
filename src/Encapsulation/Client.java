package Encapsulation;

public class Client {

    public static void main(String[] args) {

        Student student = new Student();
        //Student object has been created in the memory
        //If we don't initialize the attributes, it will take default values.
        System.out.println(student.name);

        student.name = "John Doe";
        student.age = 22;
        student.salary= 1000;
//        student.course = "English";

        System.out.println(student.name);
        System.out.println(student.age)    ;
        System.out.println(student.salary);

        student.studentStatus();

            }
}
