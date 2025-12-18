//Class - Class --> extends
//Class - Interface --> implements
//Interface - Interface --> extends

interface A{    
     void show();
     void config();
}

interface X{
    void run();
}

interface Y extends X{
    
}

class B implements A,X
{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("Running...");
    }
}

public class Demo{
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
    }
}