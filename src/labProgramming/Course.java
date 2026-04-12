//ALIF SAFWAN BIN SAIFUL ADLI
//BC252095

package labProgramming;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }

                students = temp;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            result[i] = students[i];
        }

        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                   students[j] = students[j+1]; 
                }

                students[numberOfStudents -1] = null;
                numberOfStudents--;

                return;
            }
        }

        System.out.println("Student " + student + "is not enrolled in this course.");
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {

        }
    }
}
