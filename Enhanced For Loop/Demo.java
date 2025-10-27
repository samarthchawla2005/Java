class Student {
    String name;
    int marks;
    int rollno;
}

public class Demo {
    public static void main(String a[]) {

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

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}