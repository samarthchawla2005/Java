//Enum in Java by-default extends an Enum class
enum Laptop {
    // Model(Cost)
    // Macbook(2000), DELL(5000), HP(8000), Lenevo(11000);
    Macbook(2000), DELL(5000), HP, Lenevo(11000);

    private int price;

    private Laptop() {
        //Default Price
        price = 4500;
    }

    // Parameterized Constructor
    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    // Default Constructor
    public int getPrice() {
        return price;
    }

    // Parameterized Constructor
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;

        // System.out.println("Laptop Name : Laptop Price\n" );
        // System.out.println(lap + " : " + lap.getPrice());

        // FOR ALL LAPTOPS (using enhanced for loop)

        System.out.println("Laptop Name : Laptop Price\n");
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice() + "\n");
        }
    }
}