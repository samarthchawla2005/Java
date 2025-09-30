public class Demo{
    public static void main(String a[]){
        int n = 4;
        int result = 0;
/*
        if(n%2 == 0){
            result = 10;
        }
        else{
            result = 20;
        }
 */

 //Ternary Operator
 
        // condition ? value_if_true : value_if_false;

        result = n%2 == 0 ? 10 : 20;

        System.out.println(result); 
    }
}