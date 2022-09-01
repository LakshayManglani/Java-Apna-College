package _VQ;

public class _VQ_05_Interface {
    public static void main(String[] args) {
        StudentOfIndia s1 = new StudentOfIndia();

        System.out.println();
        s1.CollgeName();
        s1.Exam();
        System.out.println();
    }
}

interface College {
    void CollgeName();
}

interface University {
    void Exam();
}

class StudentOfIndia implements College, University {
    @Override
    public void CollgeName() {
        System.out.println("S.S Jain Subodh P.G Autonoums College");
    }

    @Override
    public void Exam() {
        System.out.println("Exams are taken by University of Rajsthan");
    }
}