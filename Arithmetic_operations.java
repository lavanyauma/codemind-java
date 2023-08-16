import java.util.Scanner;
public class cmp{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s,d,p,q,r;
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        d=a-b;
        p=a*b;
        q=a/b;
        r=a%b;
        System.out.printf("Sum:%d
",s);
        System.out.printf("Difference:%d
",d);
        System.out.printf("Product:%d
",p);
        System.out.printf("Quotient:%d
",q);
        System.out.printf("Remainder:%d
",r);
    }
}