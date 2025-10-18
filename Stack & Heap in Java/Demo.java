class Calculator{
    // int num;
    int num = 69;

    public int add(int n1, int n2){
        // System.out.println(num);
        return n1+n2;
    }
}

public class Demo{
    public static void main(String a[]){
        int data = 10;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int r1 = obj.add(78,10);
        // System.out.println(r1);

        obj.num = 88;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}