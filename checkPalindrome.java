import java.util.Scanner;

public class checkPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Print p = new Print();
        Check check = new Check();

        p.Sop("Enter a string");
        String msg = sc.nextLine();

        boolean result = check.checkPalindrome(msg);

        if(result == true)
        {
            p.pf(msg);
            p.pf(" is palindrome");
        }
        else
        {
            p.pf(msg);
            p.pf(" is not a palindrome");
        }
        sc.close();
    }    
}
