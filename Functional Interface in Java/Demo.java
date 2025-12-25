//Single Abstract Method (SAM) Interface or Functional Interface
@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("in show");
    }
}

public class Demo{
    public static void main(String[] args){
        A obj = new B();
        A obj1 = new A(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
        obj1.show();
    }
}