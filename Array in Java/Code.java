public class Code
{
    public static void main(String a[])
    {
        // int nums[] = {3,7,2,4};

        // nums[1] = 6;

        int nums[] = new int[4];
        nums[0] = 6;
        nums[1] = 7;
        nums[2] = 8;
        nums[3] = 9;

        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // nums[2] = 10;
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);
        
        for(int i=0; i<=3; i++){
            System.out.println("num " + (i+1) + " = " +nums[i]);
        }

    }
}