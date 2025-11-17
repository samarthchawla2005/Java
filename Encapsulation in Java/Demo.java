class Human {
    // int age;
    private int age = 20;
    private String name = "Samarth";

    // getAge is defiend in the same calss as that of age i.e., "Human" so thats why we can access the data here
    public int getAge() {
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

public class Demo {
    public static void main(String a[]) {
        Human obj = new Human();
        // obj.age = 20;
        // obj.name = "Samarth";
        obj.setAge(20);
        obj.setName("Samarth");

        // System.out.println(obj.name);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}