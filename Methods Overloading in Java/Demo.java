class Calculator{
    public int add(int n1, int n2, int n3){
        
        // int result = n1 + n2;

        // return result;

        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
    // public double add(int n1, int n2){
    //     return n1+n2;
    // }
}

public class Demo{
    public static void main(String a[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
}