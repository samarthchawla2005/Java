class A {
    public void show() throws ClassNotFoundException {

        Class.forName("Calc");

        // try{
        // Class.forName("Calc");
        // // Class.forName("Demo");
        // }
        // catch(ClassNotFoundException e){
        // System.out.println("Not able to find the class" + e);
        // }
    }
}
public class Demo {
    static {
        System.out.println("Class Loading");
    }
    public static void main(String[] args){
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); //It prints the entire stack
        }
    }
}