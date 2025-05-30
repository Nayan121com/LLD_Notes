package copyconstructors;

public class Exam {
    String subject;
    int marks;
//    ExamCenter examCenter;

    public Exam(String subject, int marks){
        this.subject = subject;
        this.marks = marks;
    }

    public Exam(Exam e){
        this.subject = e.subject;
        this.marks = e.marks;
    }
}
