enum Status{
    Running, Failed, Pending, Success;
}

public class Demo{
    public static void main(String[] args){
        Status s = Status.Running;
        // Status s = Status.Failed;
        // Status s = Status.Pending;
        // Status s = Status.Success;

        switch(s){
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                 System.out.println("Try Again");
                 break;

            case Pending:
                System.out.println("Please Wait");
                break;

            case Success:
                System.out.println("Done");
                break;

            default:
                System.out.println("Nothing");
        }

        // if(s == Status.Running){
        //     System.out.println("All Good");
        // }
        // else if(s == Status.Failed){
        //     System.out.println("Try Again");
        // }
        // else if(s == Status.Pending){
        //     System.out.println("Please Wait");
        // }
        // else if(s == Status.Success){
        //     System.out.println("Done");
        // }
    }
}