package module_3;
import java.util.Scanner;

public class BinarySearch 
{
    public static int[] sort(int[] arr, int n)
    {
        int temp;
        for(int r=1;r<n;r++)//pass
        {
            for(int c=0;c<r;c++)//comparision
            {
                if(arr[c]>arr[r])//swap
                {
                    temp = arr[c];
                    arr[c]=arr[r];
                    arr[r]=temp;
                }
            }            
        }
        return arr;        
    }
    
    private static void display(int arr[], int n)
    {
        System.out.println("sorted elements is");
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    private static void searched(int[] arr, int n, int search)
    {
        int i=0, count=0;
        for(i=0 ; i<n ;i++)
        {
            if(arr[i] == search)
            {
                count++;
                break;
            }
        }
        if(count > 0)
        {
            System.out.println("Element Found at "+i+" index.");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
    
    public static void main(String args[])
    {
        BinarySearch bs = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in array: ");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        int lb=0, ub=arr.length-1, mid, count=0;
        mid=(lb+ub)/2;
        bs.sort(arr, n);
        
        int search=0;
        
        while(true)
        {
            System.out.println("press 1 for view sorted element.");
            System.out.println("press 2 for search element.");
            System.out.println("press 3 for exit.");
            int ch=sc.nextInt();
            switch(ch)
            {   
                case 1:
                    bs.display(arr, n);
                    break;
                case 2:
                    System.out.println("Enter element to be search");
                    search=sc.nextInt();
                    bs.searched(arr, n, search);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
        
    }
    
}

