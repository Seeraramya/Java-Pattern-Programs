import java.util.*;
public class Demo
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      pattern1(n);
      pattern2(n);
      pattern3(n);
      pattern4(n);
      pattern5(n);
      pattern6(n);
    }
    static void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        int i;
        for(i=1;i<=2*n;i++)
        {
            int c=(i<n)?i:2*n-i;
            for(int j=0;j<c;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void pattern4(int n)
    {
        int i;
        for(i=1;i<=n;i++)
        {
            
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
     static void pattern5(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j<n-i+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=n;j>=1;j--)
            {
                if(j>n-i )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
     static void pattern6(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            int c=i<=n?n-i:i;
            for(j=1;j<=c;j++)
            {
                if(j>n-i )
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}