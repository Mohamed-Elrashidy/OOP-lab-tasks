public class circle {
    private double radius;
    public void setRadius(double x)
    {
        radius=x;
    }
    public void getCircumference()
    {
        System.out.println("Circle Circumference is : "+(2*3.14*radius));
    }
    public void getArea(){
        System.out.println("Circle area is : "+ (3.14*radius*radius));
    }
}
