class A extends Thread{
    public void run(){
        for(int i = 1; i<=50; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10); //Note :- This will throw an exception, so we will use try-catch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i<=50; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

    //getPriority() => used to retrieve the current priority value of a thread in between the ranges of 1 (minimum) to 10 (maximum).
        // System.out.println(obj1.getPriority());
    
    //setPriority() => Changes the priority of this thread.
        // obj2.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try{
            Thread.sleep(5);
        }catch(Exception e){
            e.printStackTrace();
        }
        obj2.start();
    }
}