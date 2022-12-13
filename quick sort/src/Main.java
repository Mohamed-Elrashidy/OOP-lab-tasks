import javax.swing.text.Utilities;
import java.util.*;


public class Main {
    static void quickSort(int a[],int l,int r)
    {
    //   System.out.println(l+" "+r);
        if(l>=r)
            return;
        int piv=a[r];
int l1=l;
int r1=r;
// sort two halves first one less piv and second one more thant piv
while(l1<r1)
{
    if(a[r1]<=piv)
    {
        if(a[l1]>piv)
        {
            // swap
            int temp=a[r1];
            a[r1]=a[l1];
            a[l1]=temp;
        }
        l1++;

    }
    else
        r1--;
}

quickSort(a,l,l1-1);
quickSort(a,r1,r);


    }
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {a[i]=sc.nextInt();
          //  System.out.println(a[i]);
        }
      /*  for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+ ' ');
        }*/
        quickSort(a,0,n-1);
        System.out.println("Sorted array is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
            System.out.print(' ');


        }
    }
}