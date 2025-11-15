class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        // name = "Phone";
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name );
    }

}

public class Demo{
    public static void main(String a[]) throws ClassNotFoundException
    {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Samasung";
        // obj1.price = 1500;        
        // Mobile.name = "Phone_1";

        // Mobile obj2 = new Mobile();

    //For Loading the class
        
        Class.forName("Mobile");

    }
}