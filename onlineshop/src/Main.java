import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Product [] products=new Product[3];
System.out.println("Enter first book price");
Scanner sc=new Scanner(System.in);
double y=sc.nextDouble();
products[0]=new Book(y);
        System.out.println("Enter second book price");
         y=sc.nextDouble();

products[1]=new Book(y);
        System.out.println("Enter third book price");
         y=sc.nextDouble();

products[2]=new ChilldrenBook(y);
double tot=0;
for(int i=0;i<3;i++)
{
    tot+=products[i].getPrice();
}
System.out.print("total price is : ");
        System.out.println(tot);

    }
}