@FunctionalInterface
interface A {
    void show(int i);
}

public class Demo {
    public static void main(String[] args) {
        // ' -> ' is the Lambda Expression
        A obj = i -> System.out.println("in show " + i);
        obj.show(5);
    }
}