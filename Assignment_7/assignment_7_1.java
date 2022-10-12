package Assignment_7;
import java.util.*;

class Student implements Comparable<Student>{
//    class Student < T extends Comparable < T > >{
    String Name;
    int javaMarks;

    Student() {
        Name = null;
        javaMarks = 0;
    }
    Student(String name,  int javaMarks) {
        this.Name = name;
        this.javaMarks = javaMarks;
    }

    public int compareTo(Student s) {

//        System.out.println(this.javaMarks-s.javaMarks);
        return this.javaMarks-s.javaMarks;

    }

    @Override
    public String toString() {
        return String.format("%s,%d",Name,javaMarks);
    }
}

public class assignment_7_1 {
    public static void main(String[] args) {
        Student[] st = new Student[4];

        st[0] = new Student("Divy",  13);
        st[1] = new Student("Daksh",18);
        st[2] = new Student("Smit", 8);
        st[3] = new Student("Krunal", 20);

        System.out.println("Before sorting: " + Arrays.toString(st));
        Arrays.sort(st);
        System.out.println("After sorting: " + Arrays.toString(st));


    }
}

