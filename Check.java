public class Check 
{
    public boolean checkPerfectNumber(int num)
    {
        boolean result;
        int n = num, ch = 0;
        for(int i=1; i<n-1; i++)
        {
            if(n%i == 0)
            {
                ch = ch+i;
            }
        }

        result=(n == ch) ? true : false;

        return result;
    }
    
    public boolean checkArmstrongNumber(int num)
    {
        MathOperation mp = new MathOperation();

        String s = Integer.toString(num);
        int l = (int)s.length(), ch=0;

        for(int i=0; i<l; i++)
        {
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            int m=mp.power(a, l);
            ch=ch+m;
        }

        boolean result = (ch == num) ? true : false;

        return result;
    }

    public boolean checkPalindrome(String msg)
    {
        String rev="";
        for(int i=msg.length()-1; i>=0; i--)
        {
            rev=rev+msg.charAt(i);
        }
        
        boolean result = (msg.equals(rev)) ? true : false;
        
        return result;
    }

    public boolean checkPrime(int num)
    {
        int ch=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i == 0 )
            {
                ch++;
            }
        }
        
        boolean result = (ch == 2) ? true : false;
        
        return result;
    }
}
