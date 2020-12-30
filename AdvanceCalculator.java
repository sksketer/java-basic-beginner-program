import java.util.Scanner;

public class AdvanceCalculator
{
    public static void Sop(String msg)
    {
        System.out.println(msg);
    }
    public static void Sop(int msg)
    {
        System.out.println(msg);
    }
    public static void Sop(double msg)
    {
        System.out.println(msg);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Sop("Welcome to Advance Calculator");

        Sop("Enter first number");
        int fno = sc.nextInt();

        Sop("press 1 for addition");
        Sop("press 2 for subtraction");
        Sop("press 3 for multiplication");
        Sop("press 4 for Division");
        Sop("press 5 for find Remainder");
        Sop("press 6 for square of number");
        Sop("press 7 for cube of number");
        Sop("press 8 for first number power second number");
        Sop("press 9 for square root of number");
        Sop("press 10 for cube root of number");
        Sop("press 11 for root of number");
        Sop("press 12 for sin x");
        Sop("press 13 for cos x");
        Sop("press 14 for tan x");
        Sop("press 15 for sin inverse x");
        Sop("press 16 for cos inverse x");
        Sop("press 17 for tan inverse x");
        Sop("press 18 for log x");
        Sop("press 19 for e power x");
        Sop("press 20 for factorial of x");

        int operator = sc.nextInt();

        int sno=0;
        if(operator != 6 && operator != 7 && operator != 9
         && operator !=10 && operator !=12 && operator !=13
         && operator !=14 && operator !=15 && operator != 16
         && operator !=17 && operator !=18 && operator != 19
         && operator !=20)
        {
            Sop("Enter second number");
            sno = sc.nextInt();
        }        

        switch(operator)
        {
            case 1: addition(fno, sno); break;
            case 2: subtraction(fno, sno); break;
            case 3: multiplication(fno, sno); break;
            case 4: divide(fno, sno); break;
            case 5: modulas(fno, sno); break;
            case 6: square(fno); break;
            case 7: cube(fno); break;
            case 8: power(fno, sno); break;
            case 9: squreroot(fno); break;
            case 10: cuberoot(fno); break;
            case 11: root(fno, sno); break;
            case 12: sin(fno); break;
            case 13: cos(fno); break;
            case 14: tan(fno); break;
            case 15: sininverse(fno); break;
            case 16: cosinverse(fno); break;
            case 17: taninverse(fno); break;
            case 18: log(fno); break;
            case 19: ePowerX(fno); break;
            case 20: Sop(factorial(fno)); break;
            default : Sop("Wrong operator selected");
        }
        
        sc.close();
    }

    public static void addition(int fno, int sno)
    {
        int result = fno+ sno;
        Sop(result);
    }
    public static void subtraction(int fno, int sno)
    {
        int result = fno-sno;
        Sop(result);
    }
    public static void multiplication(int fno, int sno)
    {
        int result = fno*sno;
        Sop(result);
    }
    public static void divide(int fno, int sno)
    {
        int result = fno/sno;
        Sop(result);
    }
    public static void modulas(int fno, int sno)
    {
        int result = fno%sno;
        Sop(result);
    }
    public static void square(int fno)
    {
        int result = fno*fno;
        Sop(result);
    }
    public static void cube(int fno)
    {
        int result = fno*fno*fno;
        Sop(result);
    }
    public static void power(int fno, int sno)
    {
        int result = (int)Math.pow(fno, sno);
        Sop(result);
    }
    public static void squreroot(int fno)
    {
        int result = (int)Math.sqrt(fno);
        Sop(result);
    }
    public static void cuberoot(int fno)
    {
        int result = (int)Math.cbrt(fno);
        Sop(result);
    }
    public static void root(int fno, int sno)
    {
        double ssno =1/sno;
        double result = Math.pow(fno, ssno);
        Sop(result);
    }
    public static void sin(int fno)
    {
        double result = Math.sin(fno);
        Sop(result);
    }
    public static void cos(int fno)
    {
        double result = Math.cos(fno);
        Sop(result);
    }
    public static void tan(int fno)
    {
        double result = Math.tan(fno);
        Sop(result);
    }
    public static void sininverse(int fno)
    {
        double result = Math.asin(fno);
        Sop(result);
    }
    public static void cosinverse(int fno)
    {
        double result = Math.acos(fno);
        Sop(result);
    }
    public static void taninverse(int fno)
    {
        double result = Math.atan(fno);
        Sop(result);
    }
    public static void log(int fno)
    {
        double result = Math.log(fno);
        Sop(result);
    }
    public static void ePowerX(int fno)
    {
        double result = Math.exp(fno);
        Sop(result);
    }
    public static int factorial(int fno)
    {
        int result = fno;
        if(result > 1)
        {
            return result * factorial(fno-1);
        }
        else
        {
            return 1;
        }
    }
}
