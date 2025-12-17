interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile & run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile & run : Faster");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class Demo {
    public static void main(String[] args){
        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer sam = new Developer();
        sam.devApp(lap);
    }
}
