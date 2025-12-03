package other;

class Launch{
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);
    }
}

//public -> because we want to access it outside the package
public class A {
    // public int marks = 6;
    // private int marks = 6;  //Can only be used inside a same package

    protected int marks = 6;

    public void show(){

    }
}
