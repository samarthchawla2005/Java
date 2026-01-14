import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) throws IOException{
        System.out.print("Enter a Number : ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

        /*
        //Input Stream Reader
        InputStreamReader in = new InputStreamReader(System.in);

        //Buffer Reader
        BufferedReader br = new BufferedReader(in);

        //readLine() -> It gives String
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        br.close();
        
        */
    }
}