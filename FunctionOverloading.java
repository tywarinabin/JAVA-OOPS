/*
 The word Polymorphism is made up of two words : Poly and Morphism
 Poly means Many and Morphism means Forms.
 Function Overloading means function name is same but it's return type and argument taking is different 
 Some conditons for Function Overloading: 
 a.   Function have similar name but arguments must be different.
 b.   If function have similar name and return type is similar and also arguments taking 
     are also same then it show error while Compiling.
 c.   Compile Time Error is a common error because a developer already known what the error
     was and he/she wants to fix it out as quick as it possible.  
*/
class teacher{
   int id;
   int age;
   String Name;
   teacher(){   // This is a constructor with zero Arguments.
    id = 111;
    age = 35;
    Name = "Physic Wallah";
   }
   teacher (int ages){  // This is a constructor with one Arguments.
    age  = ages;
    Name = "Shraddha DD";
    id   = 156;
   }
   teacher(String name, int Id ){   // This is a constructor with two Arguments.
    Name = name;
    id = Id;
    age = 40;
   }
   teacher(String N, int a, int ID){    // This is a constructor with three Arguments.
    Name = N;
    age = a;
    id = ID;
   }
   public void getData(){
    System.out.println("Name : "+Name + "\n Age:  "+ age +" \nId No. :- "+ id);
   }
}
public class FunctionOverloading {
    public static void main(String args[]){
      teacher t1 = new teacher(26);
      t1.getData();
    }
}
