class A{
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("in A show");
    }
}

public class Demo{
    public static void main(String a[]){
        new A().show();
    }
}