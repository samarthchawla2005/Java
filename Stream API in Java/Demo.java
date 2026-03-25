import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args){
        // List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        /*
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        */

        /*
        for(int n : nums){
            System.out.println(n);
        }
        */

        nums.forEach(n -> System.out.println(n));
        
        /* 
        int sum =0;
        
        for(int n : nums){
            if(n%2 == 0){
                n = n*2;
                
                sum += n;
            }
        }
        
        // System.out.println(nums);

        System.out.println(sum);
        */

        
    }
}