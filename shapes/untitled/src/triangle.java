public class triangle {
    private double side1;
    private double side2;
    private double side3;
    private double height;
    public void setLengthAndWidth(double x,double y,double z,double w)
    {
        side1=y;
        height=x;
        side2=z;
        side3=w;
    }
    public void getArea()
    {
        System.out.println("triangle is area is : "+(side1*height*0.5));
    }
    public void getCircumference()
    {
        System.out.println("triangle circumference is : "+(side1+side2+side3));
    }
}

