/*

Collection is an Interface

Collection Interface belons to Java.util package

Types of Collection :-

1. List
    a.) Array Lists
    b.) Linked List

2. Queues
    a.) De Queue

3. Sets
    a.) Hash Set
    b.) Linked Hash Set

*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo{
    public static void main(String[] args){
        // Collection nums = new ArrayList();
        // Collection<Integer> nums = new ArrayList<Integer>();

//To work with indices / Index we must use List
        List<Integer> nums = new ArrayList<Integer>();
        
        //Adding values
          //Here the digits are not integers they are objects
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("9"); //We will get a compile time error

        // System.out.println(nums.get(2));

//Array Lists Methods
        // nums.addAll(nums);
        // nums.addAll(2, nums);

        System.out.println(nums);

        nums.clear();

        System.out.println(nums);
        

        // for (int n : nums){
        //     int num = (Integer)n; //Typecasting to Integer
        //     System.out.println(num);
        // }
    }
}