//Every Class in Java extends the object class
class A extends Object{
    //Default Constructor
    public A(){
        super(); //It is always present inside a constrctor even if we do not mention it
        System.out.println("In A");
    }
    //Parameterized Constructor
    public A(int n){
        super(); //It is always present inside a constrctor even if we do not mention it
        System.out.println("In A int");
    }
}
//B class extends A & A class extends Object (ex. of Multi-Level Inheritance)
class B extends A{
    //Default Constructor
    public B(){
        super(); //It is always present inside a constrctor even if we do not mention it
        System.out.println("In B");
    }
    //Parameterized Constructor
    public B(int n){
        // super(); //It is always present inside a constrctor even if we do not mention it
        
        //This KeyWord
        this(); //It extecutes the constructor of a same class
        System.out.println("In B int");
    }
}

public class Demo{
    public static void main(String[] args){
    /*    
        //Default Constructor Calling
        B obj = new B();

        //Parameterized Constructor Calling
        B obj2 = new B(5);
     */
        B obj = new B(5);
    }
}