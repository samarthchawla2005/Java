class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class Demo{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // B obj = new B();
        // A obj = new B();
        // A obj1 = new B();
        // A obj2 = new A();
        // obj = new B() ;//Assigining new object to a old variable
        
        // obj = new C();

        // // obj.show();
        // obj1.show();
        // obj2.show();
        // obj.show();

    }
}