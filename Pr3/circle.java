package Pr3;

public class circle extends shape {
    private double radius;

    public circle(){}
    public circle(double radius){}
    public circle(double radius, String color, boolean filled){}


    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius +
                "\nColor: " + color +
                "\nPerimeter:" + getPerimeter() +
                "\nArea: " + getArea();
    }
}