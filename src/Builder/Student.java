package Builder;

import java.util.Objects;

public class Student {

     String name;

     int age;
     String gender;

     String major;

     public String getName() {
          return name;
     }

     public int getAge() {
          return age;
     }

     public String getGender() {
          return gender;
     }

     public String getMajor() {
          return major;
     }

     public String getCourse() {
          return course;
     }

     public String getPhone() {
          return phone;
     }

     public String getEmail() {
          return email;
     }

     public String getAddress() {
          return address;
     }

     public String getCity() {
          return city;
     }

     public String getState() {
          return state;
     }

     public String getZip() {
          return zip;
     }

     String course;

     String phone;

     String email;

     String address;

     String city;
     String state;
     String zip;

     private Student(Builder builder) {
          //validations
          if(builder.gender == null) {
               throw new IllegalArgumentException("Gender should not be Empty");
          }

          this.name = builder.name;
          this.age = builder.age;
          this.gender = builder.gender;
          this.major = builder.major;
          this.course = builder.course;
          this.phone = builder.phone;
          this.email = builder.email;
          this.address = builder.address;
          this.city = builder.city;
          this.state = builder.state;
          this.zip = builder.zip;
     }

   static Builder  getBuilder(){
        return new Builder();
   }

     public static class Builder {

          String name;

          int age;
          String gender;

          String major;

          String course;

          String phone;

          String email;

          String address;

          String city;
          String state;
          String zip;

          public String getName() {
               return name;
          }

          public Builder setName(String name) {
               this.name = name;
               return this;
          }

          public int getAge() {
               return age;
          }

          public Builder setAge(int age) {
               this.age = age;
               return this;
          }

          public String getGender() {
               return gender;
          }

          public Builder setGender(String gender) {
               this.gender = gender;
               return this;
          }

          public String getMajor() {
               return major;
          }

          public Builder setMajor(String major) {
               this.major = major;
               return this;
          }

          public String getCourse() {
               return course;
          }

          public Builder setCourse(String course) {
               this.course = course;
               return this;
          }

          public String getPhone() {
               return phone;
          }

          public Builder setPhone(String phone) {
               this.phone = phone;
               return this;
          }

          public String getEmail() {
               return email;
          }

          public Builder setEmail(String email) {
               this.email = email;
               return this;
          }

          public String getAddress() {
               return address;
          }

          public Builder setAddress(String address) {
               this.address = address;
               return this;
          }

          public String getCity() {
               return city;
          }

          public Builder setCity(String city) {
               this.city = city;
               return this;
          }

          public String getState() {
               return state;
          }

          public Builder setState(String state) {
               this.state = state;
               return this;
          }

          public String getZip() {
               return zip;
          }

          public Builder setZip(String zip) {
               this.zip = zip;
               return this;
          }
          public Student build() {
               //Validations
               if(getName() == null) {
                    throw new IllegalArgumentException("Name should not be Empty");
               }
               if(getAge() < 0) {
                    throw new IllegalArgumentException("Age should not be Negative");
               }
               return new Student(this);
          }
     }
}
