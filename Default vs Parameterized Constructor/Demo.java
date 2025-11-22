class Human{
    private int age;
    private String name;

    // public Human(){ //Default Constructor
    //     age = 20;
    //     name = "Samarth";
    // }

    // public Human(int a , String n){ //Parameterized Constructor
    //     age = a;
    //     name = n;
    // }

    public Human(String name){
        // this.age = 20;
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

}

public class Demo{
    public static void main(String[] args){
        // Human obj = new Human();
        Human obj = new Human("Sam");
        Human obj1 = new Human(20, "Samarth");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}