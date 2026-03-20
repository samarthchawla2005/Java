import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo{
    public static void main(String[] args){

//Note :- Set do not provide values in sorted format
        // Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>(); //TreeSet extends an AbstractSet
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
                
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());
    }
}