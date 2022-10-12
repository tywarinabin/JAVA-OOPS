class Student {
    int roll;
    String fName;
    String lName;

    public void printDetails() {
        System.out.println("First Name :  " + fName + "\nLast Name :  " + lName + "\nRoll No.  " + roll);
    }


    /*Class is always Declared outside the Class File.
Mainly Class have two parts one is data member and another is Method which is used to operate the operation.
They are the blueprint for the object . There are mainlly three types of access specifier: 
a. PUBLIC
b. PRIVATE
c. PROCTECTED
*/
 /* Characteristics and Properties of Constructor:   */
 






 /*1. They don't have any Return Type.
2. Their name have similar to the Class Name.
3. They are used to initialize the object's Value, when the object is Created.

There are mainly three types of Constructors: 
1. Non Parameterized Constructor
Those Constructor which doesn't take any parameter is known aws Non-Parameterized Constructor.
2. Parameterized Constructor
Those constructor which takes parameter is known as the Parameterized Constructor.
3. Copy Constructor
Those constructor which is used to copy the value of another object is known as Copy Constructor.
*/

    Student() { // Default Constructor
        roll = 69;
        fName = "Ravi";
        lName = "Lamichhane";
        System.out.println("Constructor is Called.");
    }

    Student(String Name, String last) { // Parameterized Constructor.
        this.fName = Name;
        this.lName = last;
        this.roll = 97;
    }

    Student(Student ss) { // Copy Constructor
        this.fName = ss.fName;
        this.lName = ss.lName;
        this.roll = ss.roll;
    }
}
public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student("Mia", "Lamichhane");
        Student s4 = new Student(s1);
        System.out.println("Printing the data of Object :--> S4");
        s4.printDetails();
        System.out.println("Printing the data of Object :--> S1");
        s1.printDetails();
    System.out.println("Both Values are same because S4 is copied form S1 through Copy Construcotr.");
    }
}
