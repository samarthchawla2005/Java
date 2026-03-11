class Counter {
    int count;
    
// Synchronized Keyword -> Race Condition
    public synchronized void increment() {
        count++;
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //Asking main to wait for t1 & t2
            //join() is method which allows your main threads to comeback & join together
        t1.join();
        t2.join();

        System.out.println(c.count); //It will provide different output each time
    }
}