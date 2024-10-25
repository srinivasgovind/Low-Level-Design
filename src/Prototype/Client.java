package Prototype;

public class Client {
    public static  void fillRegistry(StudentRegistry registry){
        // Student template for Apr 22 batch
        Student apr22Student =  new Student();
        apr22Student.setAverageBatchScore(50);
        apr22Student.setClassName("Apr22");

        //Inserting the template in the registry
        registry.register("Apr22", apr22Student);


        TempStudent tempStudent = new TempStudent();
        tempStudent.setClassName("Apr22");
        tempStudent.setAverageBatchScore(50);
        registry.register("tempStudent", tempStudent);
    }

    public static void main(String[] args) {


        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student studentprototype = studentRegistry.get("Apr22");

        Student srinivas =  studentprototype.clone();
        srinivas.setStudentScore(75);
        srinivas.setName("Srinivas");
        srinivas.setAge(27);

        Student john =  studentprototype.clone();
        john.setStudentScore(74);
        john.setName("John");
        john.setAge(29);

        Student jack = studentRegistry.get("tempStudent").clone();
        jack.setName("Jack");
        jack.setAge(28);
        jack.setStudentScore(75);


        System.out.println("Debug");



    }

}
