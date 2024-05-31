package OOPs;

public class Create_Class {
    public static void main(String[] args) {
        class Student {
            int rno;
            int marks;
            String name;
        }

        Student s = new Student();
        s.rno = 12;
        s.marks = 1000;
        s.name = "Rahul";
    }
}
