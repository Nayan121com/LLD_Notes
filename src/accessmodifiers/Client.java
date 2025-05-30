package accessmodifiers;

import constructors.Student;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 12;
//        s.batch = "sdljbs"; // Default can't be accessed outside package
//        s.psp = 3.0f; // Protected can't be used outside package in non child class
//        s.name = "";
    }
}
