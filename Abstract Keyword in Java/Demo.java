abstract class Car{
    //abstract method can only be declared inside an abstract class
    public abstract void drive(); //Declaration
    public abstract void Horn();
    
    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class BMW extends Car{
    // public void Horn(){
    //     System.out.println("Car Stops");
    // }
    // public void drive1(){ //This will give an error
    public void drive(){ //Method Over-riding
        System.out.println("Driving...");
    }
}

//Concrete Cals => Its object can be created
class UpdatedBMW extends BMW{ 
    public void Horn(){
        System.out.println("Car Stops");
    }
}

public class Demo{
    public static void main(String[] args){
        // Car obj = new Car(); //This will cause an error
        //Abstract class objects can never be created
        // Car obj = new BMW();
        Car obj = new UpdatedBMW();

        obj.drive();
        obj.playMusic();
        obj.Horn();
    }
}