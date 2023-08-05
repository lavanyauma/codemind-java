import java.util.Scanner;
public class cm{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double p,r,t;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        double c=p*(Math.pow((1 + r / 100),t))-p;
        System.out.printf("%.2f",c);
    }
}