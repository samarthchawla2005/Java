class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A { // Method Over-riding
    public void show() {
        System.out.println("in B show");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            // Anonymous Inner Class in Java
            public void show() {
                System.out.println("in new show");
            }
        };

        // Over-riding the behaviour of show
        // A obj = new B();

        obj.show();
    }
}
