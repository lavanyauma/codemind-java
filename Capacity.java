import java.util.Scanner;
public class cm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,c,Tc;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        c=2*t*s*b*512;
        Tc=c/1024;
        System.out.printf("%d KB",Tc);
    }
}