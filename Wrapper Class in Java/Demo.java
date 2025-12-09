//For every primitive type their is a class

public class Demo{
    public static void main(String a[]){
        int num = 7; //num -> Primitive variable
        // Integer num1 = new Integer(num1) ; // Boxing -> Taking pritive value & storing in primitive object
        // Integer num1 = 8 ; // num1 -> reference variable
        Integer num1 = num; //AutoBoxing

//Interger is a "Wrapper Class"        

        // int num2 = num1.intValue(); //UnBoxing -> Getting value from Object Typt to Primitive Type 

        int num2 = num1; //Auto-UnBoxing -> Taking out primitve value form the object

        System.out.println(num2);

        String str = "69";
        int num3 = Integer.parseInt(str);

        System.out.println(num3);
    }
}