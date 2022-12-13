import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String g="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=',')
                g+=s.charAt(i);
        }
        System.out.println(g);

    }
}