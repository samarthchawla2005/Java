// class A implements Runnable{
//     public void run(){
//         for(int i = 1; i<=5; i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(13);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Demo {
    public static void main(String[] args) {
        // Reference of Interface & Object of a class
        // Runnable obj1 = new A();

        // Instantiating an interface with the help of an Anonyumous class
        
        // Runnable obj1 = new Runnable() {
        //     public void run() {
                // (Converting the above Runnable obj1 & run() into lambda expression)
        Runnable obj1 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        // Runnable obj2 = new B();
    // (Converting the above Runnable obj2 into lambda expression)
        Runnable obj2 = () -> {
            for(int i = 1; i<=5; i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(13);
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}