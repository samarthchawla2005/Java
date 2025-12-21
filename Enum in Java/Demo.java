//Class
enum Status{
    //Objects / names Constants
    Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args){
        // Status s0 = Status.Running;
        // Status s1 = Status.Failed;
        // Status s2 = Status.Pending;
        // Status s3 = Status.Success;
        // System.out.println(s0 + " - " + s0.ordinal());
        // System.out.println(s1 + " - " + s1.ordinal());
        // System.out.println(s2 + " - " + s2.ordinal());
        // System.out.println(s3 + " - " + s3.ordinal());
        //To get the ordinal / index number
        // System.out.println(s0.ordinal());
        // System.out.println(s1.ordinal());
        // System.out.println(s2.ordinal());
        // System.out.println(s3.ordinal());

        //Array for Status
        Status[] arr_Status = Status.values();
        //For printing all at once
        for(Status s : arr_Status){
            System.out.println(s);
        }
    }
}
