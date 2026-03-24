import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student implements Comparable<Student>{
class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student 's age = " + age + " , name = " + name;
    }

    // @Override
    // public int compareTo(Student that) {
    //     if(this.age > that.age)
    //         return 1;
    //     else
    //         return -1;
    // }
}

public class Demo_2{
    public static void main(String[] args){
        Comparator<Student> comp = (i, j) ->  i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(20, "Samarth"));
        studs.add(new Student(24, "Rahul"));
        studs.add(new Student(26, "Raj"));
        studs.add(new Student(18, "Aman"));

        Collections.sort(studs, comp);
        for(Student s : studs)
            System.out.println(s);
    }
}