abstract class A{
    public abstract void show();
    public abstract void config();
}

// class B extends A{
    // If we are using this methods only one, so we do not need to create this class
//     public void show() {
//         System.out.println("in B show");
//     }
// }

public class Demo {
    public static void main(String[] args){
        // A obj1 = new B();
        // obj1.show();
        A obj = new A() //Object of anonymus inner class
        {
            //Implementation of the abstract class (Only Once)
            public void show(){
                System.out.println("in new show");
            }

            public void config(){
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
