//Given an array arr, replace every element in that array with the greatest element 
//among the elements to its right, and replace the last element with -1.


// brute force solution
//time complexity O(n^2) and space comlexity O(1);
import java.util.Scanner;

public class Leader_In_Array{
    public static void main(String[] argg)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i=0;
        System.out.println("enter numbers in array:-");
        while(i<n)
        {
            arr[i++]=sc.nextInt();
        }
        int[]ans=new int[n];
        ans=replaceElements(arr);
        for(int j : ans)
        {
            System.out.print(j+" ");
        }
        sc.close();
    }

    public static int[] replaceElements(int[] arr)
    {
    
        for(int i=0;i<arr.length;i++)
        {
            int max=0;
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[j]>max)
               {
                max=arr[j];
               }
            }
            if(i==arr.length-1)
            {
                arr[i]=-1;
                break;
            }
            
            arr[i]=max;
        }
        return arr;

    }
}