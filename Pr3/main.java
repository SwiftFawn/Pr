package Pr3;

public class main {
    public static void main(String[] args)
    {
        rectangle a = new rectangle();
        circle b = new circle();
        square c = new square();


        a.setLength(12);
        a.setWidth(22);
        a.setColor("Red");
        a.setFilled(true);
        System.out.println(a.toString());

        b.setRadius(10);
        b.setColor("Blue");
        b.setFilled(true);
        System.out.println("\n" + b.toString());

        c.setLength(10);
        c.setColor("Black");
        c.setFilled(true);
        System.out.println("\n" + c.toString());



    }
}
