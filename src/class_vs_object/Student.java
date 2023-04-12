package class_vs_object;

public class Student {

    public Student(){

    }

    public Student(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Student(String fullName, int age, Teacher teacher) {
        this(fullName, age);
        this.teacher = teacher;
    }

    public static final String course = "Software Engineer in Test";
    public static int totalNumberOfStudents = 42;

    public String fullName;
    public int age;
    public Teacher teacher;

    public static String getCourse(){
        return course;
    }

    public static void decreaseNumberOfStudentByOne(){
        totalNumberOfStudents--;
    }

    public static void decreaseNumberOfStudent(int num){
        totalNumberOfStudents -= num;
    }

    public String getFullName(){
        return fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
