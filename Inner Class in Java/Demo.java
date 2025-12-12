class A{
    //varable
    int age;

    //method
    public void show(){
        System.out.println("In show");
    }

    // class B{
    static class B{
        public void config(){
            System.out.println("In config");
        }
    }
}

public class Demo{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B(); // Cause B belongs to A
        A.B obj1 = new A.B(); // For static class only
        
        obj1.config();
    }
}