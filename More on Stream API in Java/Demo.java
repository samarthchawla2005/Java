import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Demo{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        //Stream can't be re-used
       /*
       Stream<Integer> s1 = nums.stream();
       Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
       Stream<Integer> s3 = s2.map(n -> n*2);
        
       int result = s3.reduce(0, (c,e) -> c + e);
       */

       int result = nums.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c + e);

        System.out.println(result);

        // s1.forEach(n -> System.out.println(n));//It can only run once
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
                
    }
}