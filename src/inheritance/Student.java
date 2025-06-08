package inheritance;

import java.util.Queue;
import java.util.Stack;

public class Student extends User{
    private String batch;
    public int psp;

    public Student(){
        //super() - behind the scenes
//        If we are calling the super then it should be first statement in the constructor
//        It should not be below other instructions
//        Super is nothing but call to the parent constructor
        super("122", "Alash");
        this.psp = 15;
        System.out.println("Student default constructor called");
    }

    public void doSomething(){
        this.batch= "kshdb";
        this.getId();
    }
}
