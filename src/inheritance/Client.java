package inheritance;

public class Client {
    public static void main(String[] args) {
//        User u =  new User();
/*      Since we have created the Student Object by calling the Student Un-Parameterized Constructor so, it will call the student
        constructor first and then inside that there will be by default
*/
//      call to the super() which will call to the parent constructor.
/*      One interesting thing -> 'id' be private in user. So will it be inherited to the Student or not?
        It will be inherited, it will get the memory when the subclass obj created, but it won't be directly accessed.
*/
        Student s = new Student();

//        How this u will work ->
/*
        Student class extended the User class, It means object of student is the user
        but is of special kind and that is student.
        But now, parent class reference points to the child class object.
        Now, here User can be anything right like -> Student, teacher, Accountent, Receptionist etc.
        Now, user reference will decide what all properties and behaviour it could access.
        because example -> every user wont be having psp property right? So, a reference of parent type can't access the properties and behaviours of the child classes, but it will be having all this properties in the memory of the object.
 */
        User u = new Student();
        u.setId("1");
//        u.doSomething(); Error
//        u.psp = 45; Error
        System.out.println("DEBUG");
    }
}
