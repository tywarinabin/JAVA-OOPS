
/*
    Inheritance means transforming character from parents to Child. But in case of Program using OOPS inheritance allows us to create a new class and inherit a property from the previously made class to new made class. 
    
    Advantage of Inheritance
    a.  It helps in Reusability of the programs.
    b.  It helps to reduce duplicate and Redudancy in the Programs.
    c.  It saves the time of the programmer becauses to create a new class with similar 
        property  it takes time to manage it.
    d.  Transforming the character from parent to child where character are inherited.

    There are 4 types of Inheritance 
    1. Single Inheritance 


                      Animal Class



                      Dog Class



        (1)   Base Class -----> (1)   Derived Class
    
    2. Multiple Inheritance 

                                    Vehicle Class  
                    
                                     Car Class

                                     Ferrari Class


    
               (1)   Base Class -----> (1)   Derived Class
               Derived Class 1(Base Class now) -----> New Derived Class 
    
    3. Hiererichal Inheritance 
    One base class inherits two other derived class is known as Hierarichal Inheritance
                                    Teacher Class
                            
                       Math_Teacher             Science_Teacher
 */
class Shape{
    String color;
    Shape(){
        color = "White";
    }
}
class Triange extends Shape{
    int l,b,h;
    public void getData(){
        l = 12;
        b = 17;
        h = 14;
        System.out.println("Enter length, breadth and Height: ");
    }
    public void perimeter(){
        System.out.println("Colour of Triangle is :  "+color);
        System.out.println("Perimeter of a Triange is :   "+(l+b+h));
    }
}
public class Single_Inheritance {
    public static void main(String args[]){
Triange t1 = new Triange();
// t1.color = "Violet";
t1.getData();
t1.perimeter();
    }
}
