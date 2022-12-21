public class Cylinder extends Circle{
    Cylinder()
    {
        super();
    }
    Cylinder(double h)
    {
        super();
        setHeight(h);

    }
    Cylinder(double r,double h)
    {
        super(r);
        setHeight(h);
    }
    Cylinder(double r,double h,String k)
    {
        super(r,k);
        setHeight(h);
    }

    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume()
    {
        return getArea()*getHeight();
    }
}
