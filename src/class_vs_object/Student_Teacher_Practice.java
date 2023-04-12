package class_vs_object;

public class Student_Teacher_Practice {
    public static void main(String[] args) {
        /*
         Create 3 students object with below info

         s1 = John Doe, 45
         s2 = Jane Doe, 35
         s3 = Alex Smith, 60
         */

        Student s1 = new Student("John Doe", 45);
        Student s2 = new Student("Jane Doe", 35);
        Student s3 = new Student("Alex Smith", 60);

        /*
        Create 2 teachers with below info

        t1 -> Adam Nasr
        t2 -> Alina Graur
         */

        Teacher t1 = new Teacher("Adam Nasr");
        Teacher t2 = new Teacher("Alina Graur");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(t1);
        System.out.println(t2);


        /*
        Adam Nasr   -> John Doe
                    -> Alex Smith

         Alina      -> Jane Doe
         */
        System.out.println("\n------------------------------\n");
        s1.teacher = t1;
        s2.teacher = t2;
        s3.teacher = t1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(t1);
        System.out.println(t2);


    }
}
