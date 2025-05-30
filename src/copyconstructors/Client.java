package copyconstructors;

public class Client {
    public static void main(String[] args) {
        Exam e = new Exam("Maths", 90);
        Student s = new Student("Akash", 29, "morning", 10.9f, e);

        Student s1 = s; // shallow copy

        Student s2 = new Student(s);
        s2.age =10;
        s2.setName("Sam");
        s2.batch = "Evening";

        s2.exam.marks = 40;

        System.out.println("DEBUG");
    }
}
