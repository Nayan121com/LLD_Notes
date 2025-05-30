package copyconstructors;

public class Student {
    private String name;
    public int age;
    String batch;
    protected float psp;

    Exam exam;


    public Student(String name, int age, String batch, float psp, Exam exam){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp= psp;
        this.exam = exam;
    }

    public Student(String name, int age, String batch, float psp, String subject, int marks){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp= psp;
        this.exam = new Exam(subject, marks);
    }

    public Student(Student s){ //copy constructor for student
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.psp = s.psp;
//        this.exam = s.exam; // Reference vars -> Shallow copy
        //deep copy - simple way
//        this.exam = new Exam(s.exam.subject, s.exam.marks);
        //deep copy - copy constructor
        this.exam = new Exam(s.exam);

    }

    void setName(String name){
        if(name != ""){
            this.name = name;
        }
    }
}
