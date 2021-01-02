import java.util.Scanner;

public class checkArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Print p = new Print();
        Check check = new Check();

        p.Sop("Enter a Number");
        int num = sc.nextInt();

        boolean result = check.checkArmstrongNumber(num);

        if(result == true)
        {
            p.pf(num);
            p.pf(" is Armstrong Number");
        }
        else
        {
            p.pf(num);
            p.pf(" is not a Armstrong Number");
        }

        sc.close();
    }    
}
