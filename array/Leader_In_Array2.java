// optimal solution
//time complexity O(n) and space comlexity O(1);
import java.util.Scanner;

public class Leader_In_Array2{
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
       int max=-1;
        for(int i= arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
            else
            arr[i]=max;
        }
        return arr;
    }
}