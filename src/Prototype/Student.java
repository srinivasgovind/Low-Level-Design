package Prototype;

public class Student implements Prototype {

     private String name;

     private int age;
     public Student(){}
     public Student(Student student) {
          this.name = student.name;
          this.age = student.age;
          this.studentScore= student.studentScore;
          this.averageBatchScore = student.averageBatchScore;
          this.className = student.className;
     }

     public void setName(String name) {
          this.name = name;
     }



     public void setAge(int age) {
          this.age = age;
     }


     public void setStudentScore(double studentScore) {
          this.studentScore = studentScore;
     }


     public void setAverageBatchScore(double averageBatchScore) {
          this.averageBatchScore = averageBatchScore;
     }

     public void setClassName(String className) {
          this.className = className;
     }

     private double studentScore;

     private double averageBatchScore;

     private String className;


     @Override
     public Student clone() {
          Student student = new Student();
          student.averageBatchScore = this.averageBatchScore;
          student.className = this.className;
          return student;
     }
}
