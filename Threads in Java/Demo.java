//Note :- If we want to execute two things at the same time then we use threads

//To make the class thread extend the class with thread

//Schedular allows a thread to execute
class A extends Thread{
    public void run(){ //In every thread we need to have a run() method, because thread calls the run() method
        for(int i = 1; i<=10; i++){
            System.out.println("Hi ");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("Hello");
        }
    }
}

public class Demo{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

//start() - A method used to start a new thread    
        obj1.start();
        obj2.start();
    }
}