public class Demo{
    public static void main(String a[]){
        // Calc obj = new Calc();
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.multi(2,10);
        int r4 = obj.div(22,11);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}