public class Demo{
    public static void main(String[] args){
        
        int i = 0;
        // int i = 2; //If we don't get the exception so it will print the "Bye" which is coming from the try block
        int j = 0;
        
        try{
            j = 18/i; //Exception occured here
            System.out.println("Bye"); //It do not print this because the moment we got exception, the try jump to catch
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
            // System.out.println("Bye."); //Ir-respective of this that we have got exception or not, it will surely print Bye.
        }
        //Whenever we want to close the resource we use their finally
        finally{
            //This block get executed irrespective of this that we get exception or not
            System.out.println("Bye.");
        }
    }
}