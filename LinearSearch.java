package module_3;
import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element which you want to search");
        int data=sc.nextInt();
        int count=0, index = 0;
        for(int i=0 ; i<n ;i++)
        {
            if(arr[i] == data)
            {
                count++;
                index=i;
                break;
            }
        }
        if(count > 0)
        {
            System.out.println("Element Found at "+index+" index.");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }    
}
