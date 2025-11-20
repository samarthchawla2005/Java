class Human {
    private int age = 20;
    private String name = "Samarth";

    //Constructor
    // public Human(){
    //     System.out.println("in constructor");
    // }

    public Human(){
        age = 20;
        name = "Samarth";
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Demo {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1 = new Human();

        System.out.println(obj.getName() + " : " + obj.getAge());

        // obj.setAge(20);
        // obj.setName("Samarth");

        // System.out.println(obj.name);

    }
}