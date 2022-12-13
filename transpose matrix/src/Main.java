import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter dimensions of matrix : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a[][]=new int[x][y];
        for(int i=0;i<x;i++)
        {
            for(int f=0;f<y;f++)
            {
                a[i][f]=sc.nextInt();
            }
        }
        int ans[][]=new int[y][x];

            for(int i=0;i<x;i++)
            {
                for(int f=0;f<y;f++)
            {
                ans[f][i]=a[i][f];
            //    System.out.println(ans[f][i]);
            }
        }
        for(int i=0;i<y;i++)
        {//System.out.println(y);
            for(int f=0;f<x;f++)
            {
                System.out.print(ans[i][f]+"   ");

        }
        System.out.println();
        }


    }
}