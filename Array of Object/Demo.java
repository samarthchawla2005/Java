class Student{
    String name;
    int marks;
    int rollno;
}

public class Demo
{
    public static void main(String a[])
    {
        // int nums[] = new int[6];
        /*
         
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 6;
        nums[3] = 9;
        
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        */

        Student s1 = new Student();
        s1.name = "Samarth";
        s1.marks = 20;
        s1.rollno = 1;

        Student s2 = new Student();
        s2.name = "Shiv";
        s2.marks = 19;
        s2.rollno = 2;

        Student s3 = new Student();
        s3.name = "Shahswat";
        s3.marks = 18;
        s3.rollno = 3;

        // System.out.println("Student Name" + " | " + "Student Marks" + " | " + "Students Roll Number");

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " | " + students[i].marks + " | " + students[i].rollno);
        }
    }
}