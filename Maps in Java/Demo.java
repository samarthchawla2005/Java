//Map is a collection of Key & a value pair

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo{
    public static void main(String[] args){
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>();

        students.put("Samarth", 69);
        students.put("Raj", 82);
        students.put("Rahul", 73);
        students.put("Veer",44);
        //Keys cannot be repeated
        //key -> set & value -> list
        students.put("Raj",54); //Value gets change if key is same

        // System.out.println(students);

        // System.out.println(students.get("Rahul"));
        // System.out.println(students.get("Raj"));
        // System.out.println(students.get("Samarth"));
        // System.out.println(students.get("Veer"));

        // System.out.println(students.keySet()); //To print all the keys

        // System.out.println(students.values()); //To print all the values

    //To print both keys & values
        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}