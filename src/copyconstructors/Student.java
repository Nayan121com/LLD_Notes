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
        this.exam = exam; // This is the shallow copy, it will assign the address as value to the exam obj
    }

    public Student(String name, int age, String batch, float psp, String subject, int marks){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp= psp;
        this.exam = new Exam(subject, marks); // This is the Deep Copy because we are creating new obj of type Exam
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
        // This is a better way because we do not require to send all the attribute in function while calling.
        this.exam = new Exam(s.exam); // This is the other way of doing deep copy i.e., by using the Copy constructor.
    }

    void setName(String name){
        if(name != ""){
            this.name = name;
        }
    }
}
