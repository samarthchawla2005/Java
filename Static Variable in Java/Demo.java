class Mobile{
    String brand;
    int price;
    // String name;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name );
    }
}

public class Demo{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samasung";
        obj1.price = 1500;
        // obj1.name = "Phone_1";
        Mobile.name = "Phone_1";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 3599;
        // obj2.name = "Phone_2";
        Mobile.name = "Phone_2";

        Mobile obj3 = new Mobile();
        obj3.brand = "Vivo";
        obj3.price = 2809;
        // obj3.name = "Phone_3";
        Mobile.name = "Phone_3";

        // After putting name as static variable
        // obj1.name = "Phone";
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        obj3.show();
    }
}