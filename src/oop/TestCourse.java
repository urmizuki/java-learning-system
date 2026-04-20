package oop;

public class TestCourse {

    public static void main(String[] args) {
        Course myCourse = new Course("SE 101");
        myCourse.addStudent("Alif");
        myCourse.addStudent("Amsyar");
        myCourse.addStudent("Luqman");

        String[] students = new String[myCourse.getNumberOfStudents()];
        students = myCourse.getStudents();
        
        myCourse.dropStudent("Amsyar");

        System.out.println("Students: ");
        for (int i = 0; i < myCourse.getNumberOfStudents(); i++) {
            System.out.println(students[i] + " ");
        }
        System.out.println();
    }
}
