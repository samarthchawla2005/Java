import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int num = 0;
        // BufferedReader br = null;

        /*try with finally */

        // try{
        //     // InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally{
        //     //Finally bloack is used to close the resource
        //     br.close();
        // }

        /*try with resources */
        try(BufferedReader br = new BufferedReader(new InputStreamReader(null))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
