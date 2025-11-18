class Human {
    private int age = 20;
    private String name = "Samarth";
    public int getAge() {
        return age;
    }
    public void setAge(int age, Human obj) {
        // Human obj1 = new Human();
        // Human obj1 = obj;
        // obj1.age = age;
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
    public static void main(String a[]) {
        Human obj = new Human();
        // obj.setAge(20);
        obj.setAge(20,obj);
        obj.setName("Samarth");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}