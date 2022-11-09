class Person{
    String name;
    Person(){
    System.out.println("Person Constructor. ");
}
Person(String name){
    System.out.println("Name of Person is : "+name);
}
}
class Student extends Person{
    int id;
    Student(){
        System.out.println("Student Default Constructor.");
    }
    Student(int id, String name ){
        super(name);     // ---> This super call the constructor Person by passing Value of Name ...
        System.out.println("Student ID's : "+id);
    }
}
class Faculty extends Student{
    double Salary;
    Faculty(){
        // super("Nabin Tiwari");
        super();    // -> This super call the constructor with no argument of Base Class.
        System.out.println("Faculty Default Constructor.");
    } 
    Faculty( String name, int id , double salary){
        super(id,name);    // --> This super call the Base Class Constructor with one arguments.
        System.out.println("Salary of "+name+" is  "+ salary+" $");
    }
}
public class Inheritance{
    
    public static void main(String[] args) {
       Faculty f = new Faculty("Gyan Tiwari",25364, 7000.50);
       Student s = new Student(56,"Hari");
       Person p = new Person("Manisha Dumere"); 
    }
}