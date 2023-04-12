package class_vs_object;

import java.util.ArrayList;

public class Teacher {

    public Teacher(){

    }

    public Teacher(String fullName) {
        this.fullName = fullName;
    }

    public String fullName;
    public ArrayList<Student> students = new ArrayList<>();



    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", students=" + students +
                '}';
    }
}
