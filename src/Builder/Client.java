package Builder;

public class Client {

    public static void main(String[] args) {

        Student student = Student.getBuilder()
                .setName("Sai Srinivas")
                .setAddress("133 asdf")
                .setAge(25 )
                .setGender("Male")
                .build();

        System.out.println(student.getName());
    }
}
