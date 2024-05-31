package OOPs;

public class Create_Class {
    public static void main(String[] args) {
        class Student {
            int rno;
            int marks;
            String name;

            Student() {
                System.out.println("Default Constructor called");
            }

            Student(int rno, int marks, String name) {
                this.rno = rno;
                this.marks = marks;
                this.name = name;
                System.out.println("Parameterized Constructor called");
            }
        }

        Student s = new Student(12, 100, "Rahul");
        Student s1 = new Student();
        // this keyword is used to refer to the current object. It is simply replaced by
        // the object name.
    }
}
