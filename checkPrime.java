import java.util.Scanner;

public class checkPrime
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Print p = new Print();
        Check check = new Check();

        p.Sop("Enter a number");
        int num = sc.nextInt();

        boolean result = check.checkPrime(num);

        if(result == true)
        {
            p.pf(num);
            p.pf(" is prime");
        }
        else
        {
            p.pf(num);
            p.pf(" is not prime");
        }

        sc.close();
    }    
}
