package constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("Akash", 23);
        s.age = 12;
        s.batch = "morning";
        s.psp = 3.0f;
        s.setName("Akash");




        System.out.println("DEBUG");
        s2 = s;

        System.out.println("DEBUG");
    }
}
