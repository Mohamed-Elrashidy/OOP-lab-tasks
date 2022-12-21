import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }
    public Circle(double r)
    {
        setRadius(r);
    }
    public Circle(double r, String c)
    {
        setRadius(r);
        setColor(c);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea()
    {
        return getRadius()*getRadius()*3.14;
    }
}
