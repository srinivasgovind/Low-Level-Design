package Prototype;

public class TempStudent extends Student {

    String graduationCollege;

    public TempStudent() {

    }

    public TempStudent(TempStudent tempStudent) {
        super(tempStudent);
        this.graduationCollege = tempStudent.graduationCollege;
    }

    @Override
    public TempStudent clone(){
        return new TempStudent(this);
    }
}
