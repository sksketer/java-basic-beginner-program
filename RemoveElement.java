package Programs;
import java.util.Scanner;

public class RemoveElement 
{
    public int[] remove(int[] arr, int m, int n)
    {
        for(int i=m ; i<n-1 ; i++)
        {
            arr[i]=arr[i+1];
        }
        
        return arr;
        
    }
    
    public static void main(String args[])
    {
        RemoveElement re = new RemoveElement();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Index to be Deleted: ");
        int m=sc.nextInt();
        re.remove(arr, m, n);
        n--;
        
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
