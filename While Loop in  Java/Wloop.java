public class Wloop{
    public static void main(String a[]){
        int i = 1;

        while(i<=5){
            System.out.println("Hello " + i);
            int j = 1;
            while(j<=3){
                System.out.println("Hi " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);
    }
}