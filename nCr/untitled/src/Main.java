import java.util.Scanner;
import static java.lang.Math.max;

public class Main {

    static  long  nPr(int  n,int  r)
    {
        long  ans=1;
        for(int i=r+1;i<=n;i++)
            ans*=i;
        return ans;
    }
     static long  nCr(int  n,int  r)
    {
        long  ans=1;
        for(int i=max(r+1,n-r+1),k=1;i<=n;i++,k++)
        {ans*=i;
        ans/=k;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n=input.nextInt(),r=input.nextInt();
        System.out.println("Combination is : "+nCr(n,r));
        System.out.println("Permutation is : "+nPr(n,r));

    }
}