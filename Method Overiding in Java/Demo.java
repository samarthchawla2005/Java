class A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    // public void show1(){
    //     System.out.println("in B show");
    // }
    public void show(){
        System.out.println("in B show");
    }
}

public class Demo{
    public static void main(String[] args){
        // A obj = new A();
        B obj = new B();
        obj.show();
        // obj.show1();
        obj.config();
    }
}