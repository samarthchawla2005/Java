class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name );
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name );
    }
}

public class Demo{
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samasung";
        obj1.price = 1500;        
        Mobile.name = "Phone_1";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 3599;
        Mobile.name = "Phone_2";

        Mobile obj3 = new Mobile();
        obj3.brand = "Vivo";
        obj3.price = 2809;
        Mobile.name = "Phone_3";

        // After putting name as static variable
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        obj3.show();

        Mobile.show1(obj1);
    }
}