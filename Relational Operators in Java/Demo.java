class Demo
{
    public static void main(String [] args)
    {
        int x = 6, y = 5;  //For result
        int a = 6, b = 6;  //Also return false  // For result_2

        int c = 7 , d = 8; // For result_3

        int e = 3, f = 3; // For result_4

        int g = 12, h = 21; // For result_5

        double i = 8.8, j = 9.8;  // For result_6

        boolean result = x < y;  //Boolean return 'True' or 'False'
        // boolean result = x >= y;  // Returns True for x = 6, y = 6
        boolean result_2 = a <= b;  // Returns True for x = 6, y = 6

        boolean result_3 = c != d; //Returns True

        boolean result_4 = e == f; // Returns True

        boolean result_5 = g == h; //Return False

        boolean result_6 = i >= j; //Returns False

        System.out.println(result);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);
        System.out.println(result_6);
    }
}