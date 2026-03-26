import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

//filter        
/*
Predicate<Integer> p = new Predicate<Integer>(){
    // @Override
    // public boolean test(Integer n) {
        // if(n%2 == 0)
        //     return true;
        // else
            //     return false;
        
        // return n%2 == 0;
        // }        
    };
    */

//map
    /*
    Function<Integer, Integer> fun = new Function<Integer,Integer>() {
        public Integer apply(Integer n){
            return n*2;            
        }
    };
    
    // Function<Integer, Integer> fun = n -> n*2;
    */

//reduce  
    /*
    int result = nums.stream()
    .filter(n -> n%2 == 0)
    // .filter(p)
    // .map(fun)
    .map(n -> n*2)
    .reduce(0, (c,e) -> c + e);
    
    System.out.println(result );
    */

//Sort
    /*
    Stream<Integer> sortedValues = nums.stream()
    .filter(n -> n%2 == 0)
    .sorted();
    
    sortedValues.forEach(n -> System.out.println(n));
    */

//Sort method in case of String
    Stream<Integer> sortedValues = nums.parallelStream()
    .filter(n -> n%2 == 0)
    .sorted();
    
    sortedValues.forEach(n -> System.out.println(n));

    }
}