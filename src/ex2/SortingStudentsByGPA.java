package ex2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public SortingStudentsByGPA() {
    }

    public int compare(Student o1, Student o2) {
        return -(o1.getBal() - o2.getBal());
    }
}