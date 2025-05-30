package constructors;

public class Student {
    private String name;
    public int age;
    String batch;
    protected float psp;

    //Unparameterised constructor
    public Student(){
        //all values get assigned to default
    }
    //Parameterised constructors
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayName(){
        this.age = 20;
        this.batch = "morning";
        this.psp = 3.0f;
        System.out.println("Student name : " + name);
    }

    void setName(String name){
        if(name.contains("@")){
            throw new RuntimeException();
        }
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
