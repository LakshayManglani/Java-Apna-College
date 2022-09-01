package _VQ;

public class _VQ_02_Constructors {
    public static void main(String[] args) {
        // Constructor Overloading :- When many constructor are called for an single
        // class
        Student s1 = new Student();
        Student s2 = new Student("Lakshay");
        Student s3 = new Student(7);

        // Copy Constructor
        s1.name = "Lakshay Manglani";
        s2.rollNo = 7;
        s1.password = "abcd";
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s1Copy = new Student(s1);
        s1.marks[1] = 50;
        s1Copy.password = "efgh";// Setting New Password

        for (int i = 0; i < s1Copy.marks.length; i++) {
            System.out.print(s1Copy.marks[i] + " ");
        }
        System.out.println();
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // Shallow copy Constructor :- Changes Reflect
    // Shallow copy constructor also work on class under a class
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.rollNo = s1.rollNo;
    // this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println();
        System.out.println("Student Constructor is called ...");
        System.out.println();
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollNo) {
        marks = new int[3];
        this.rollNo = rollNo;
    }
}