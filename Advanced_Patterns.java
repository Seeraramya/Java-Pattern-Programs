import java.util.*;
public class Demo1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern1(n);
    }
    static void pattern1(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int space=i<=n?n-i:i-n;
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            int collim=i<=n?2*i-1:2*i-n-4*(2*n-i);
            for(int j=1;j<=collim;j++)
            {
                System.out.printf("*");
            }
            System.out.print("\n");
        }
    }
}