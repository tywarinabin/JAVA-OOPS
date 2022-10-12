class Pen {
    String color;
    String type;

    public void Write() {
        System.out.println(this.type + " pen writes " + this.color);
    }
}
class Student {
    int roll;
    String fName;
    String lName;
    public void printDetails(){
        System.out.println("First Name :  "+ fName + "\nLast Name :  "+ lName + "\nRoll No.  "+roll);
    }
    Student(){
         roll = 69;
         fName = "Ravi";
         lName = "Lamichhane";
        System.out.println("Constructor is Called.");
    }
}
public class JavaClass{
 public static void main(String args[]){
    Pen pen1 = new Pen();
    pen1.color = "Red";
    pen1.type = " Ink Pen";
    pen1.Write();
Student s1 = new Student();
// s1.fName = "Nabin";
// s1.lName ="Tywari";
// s1.roll = 69;
 s1.printDetails();
 }

}