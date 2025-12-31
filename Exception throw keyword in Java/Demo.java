public class Demo {
    public static void main(String[] args) {
        // int i = 9;
        int i = 0;
        // int i = 2;
        // int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0){
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("Thats the default output");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong... " + e);
        }

        System.out.println(j);
        System.out.println("Exit");
    }
}