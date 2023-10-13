import java.util.Scanner;
public class cmp{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int total,x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        total=(x*1)+(y*2);
        if(x==0 && y%2==0)
        {
            System.out.printf("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.printf("NO");
        }
        else if(total%2==0)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}