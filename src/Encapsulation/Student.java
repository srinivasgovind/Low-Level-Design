package Encapsulation;

public class Student {

    public String name;

    protected int age;

    double salary;

    private String course;

    void studentStatus(){
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary);
    }
}
