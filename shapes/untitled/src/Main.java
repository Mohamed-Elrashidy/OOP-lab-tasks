import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
while (true) {
    System.out.println("If you want to calculate circle prameters press 1 :");
    System.out.println("If you want to calculate triangle prameters press 2 :");
    System.out.println("If you want to exist  press 3 :");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x==1)
    {
        circle c1=new circle();
        System.out.println("Enter radius");
        double y=sc.nextDouble();
        c1.setRadius(y);
        c1.getArea();
        c1.getCircumference();

    }
    else if(x==2)
    {
        triangle r1=new triangle();
        System.out.println("Enter height and it\'s base and other 2 side lengths");
        double y=sc.nextDouble();
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();


        r1.setLengthAndWidth(y,s1,s2,s3);
        r1.getArea();
        r1.getCircumference();
    }
    else break;

}







    }
}