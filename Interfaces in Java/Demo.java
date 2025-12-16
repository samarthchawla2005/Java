// abstract class A{
//     public abstract void show();
//     public abstract void config();
// }

//Interface is used to design something
//It tell only methods, it do not implement them
interface A{ //Interface is not a class & every method in abstract is by-default considered as public abstract
   //Variables :-
    //All variables inside the interface are by-default final & static, thats why we need to initialize the variable
     int age = 20;
     String city = "Indore";
   
    //Methods :-
     void show();
     void config();
}

//implements => It is a keyword used to implement the interface
//It is necessary to define both the methods otherwise the classes will be by-fdefault considered as abstract class
class B implements A
{
//Defining methods
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
}

public class Demo{
    public static void main(String[] args){
        A obj;
        // obj = new A(); //Interface cannot be Instantiated
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.city);
    }
}