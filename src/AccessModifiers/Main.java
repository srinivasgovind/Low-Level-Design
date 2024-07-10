package AccessModifiers;

import Encapsulation.Student;

public class Main extends Student {

public static void main(String[] args) {

    Main m = new Main();
        m.age = 23;
        m.name = "John Doe";

        //salary is default (not accesible in other package)
//        m.salary = 1000;

        //age is protected( accessible in other package but in child classes)
        m.age = 25;

        //batch  is private
        //m.salary =
}

}
