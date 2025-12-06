//final variabls - It means making constants
//final class - No one can extend it
//final method - Stops method over-riding

// final class Calc
class Calc
{
    // public void show()
    public final void show()
    {
        System.out.println("in Calc Show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc
{
    public void show() {
        System.out.println("By SAM");
    }
}

public class Demo {
    public static void main(String[] args){
        // Calc obj = new Calc();
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 5);
    }
}