import java.util.Scanner;
public class PerfectSquare
{    
    public static boolean isPerfectSquare(int n)
    {
        int sum = 1;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == n && n != 1)
            return true;
        return false;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}