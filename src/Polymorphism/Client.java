package Polymorphism;


public class Client {

    public static void main(String[] args) {
      User user = new Student();
     // user.batch = "May 2024"; // not accessible due to objects are created at run time.
    }
}
