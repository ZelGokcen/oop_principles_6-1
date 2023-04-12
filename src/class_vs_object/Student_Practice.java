package class_vs_object;

public class Student_Practice {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.fullName = "Carmela Creata";

        System.out.println(Student.course); // Software Engineer in Test

        // Student.course = "Java Developer"; // final cannot be updated

        System.out.println(Student.course); // Java Developer

        System.out.println(Student.totalNumberOfStudents); // 42
        Student.decreaseNumberOfStudentByOne(); // 41
        Student.decreaseNumberOfStudent(2); // 39
        Student.decreaseNumberOfStudent(15); // 24

        System.out.println(Student.totalNumberOfStudents); // 24

        System.out.println(student1.getFullName()); // Carmela Creata
    }
}
