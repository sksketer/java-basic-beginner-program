import java.util.Scanner;
public class checkPerfectNumber 
{
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);
        Print p = new Print();
        Check check = new Check();

        p.Sop("Enter a Number");
        int num = sc.nextInt();

        boolean result = check.checkPerfectNumber(num);

        if(result == true)
        {
            p.pf(num);
            p.pf(" is Perfect Number");
        }
        else
        {
            p.pf(num);
            p.pf(" is not Perfect Number");
        }

        sc.close();
    }
}
