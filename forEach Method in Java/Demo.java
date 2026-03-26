import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //Consumer Interface
   /* 
        Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };
    */

   //Using Lambda Expression

        /*
        Consumer<Integer> con = (Integer n) -> {
            System.out.println(n);
        };
        */

        // Consumer<Integer> con = (Integer n) -> System.out.println(n);

        // Consumer<Integer> con = n -> System.out.println(n);
        
        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
                
    }
}