// class NewCustomException extends Exception
class NewCustomException extends RuntimeException
 {
    public NewCustomException(String string) {
        super(string);
    }
}

public class Demo {
    public static void main(String[] args) {
        // int i = 0;
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new NewCustomException("I don't want to print zero");
            }
        } catch (NewCustomException e) {
            j = 18 / 1;
            System.out.println("Thats the default output" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong... " + e);
        }

        System.out.println(j);
        System.out.println("Exit");
    }
}