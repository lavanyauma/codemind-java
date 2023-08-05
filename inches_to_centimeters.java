import java.util.Scanner;
public class cm{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double c;
        int h;
        h=sc.nextInt();
        c=2.54*h;
        System.out.printf("%.2f",c);
    }
}