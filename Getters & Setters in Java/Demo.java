class Human {
    // int age;
    private int age = 20;
    private String name = "Samarth";
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