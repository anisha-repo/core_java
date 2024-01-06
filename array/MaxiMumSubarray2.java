//subarray with largest summ
//optimal solution
//kadane's algo
//time complexity O(n);
//space complexity O(1);

import java.util.Scanner;

public class MaxiMumSubarray2 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
int ans=MaxiMum_Subarray(arr);
System.out.println(ans);
    }
    public static int MaxiMum_Subarray(int[] nums)
    {
        int maxi=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++)
        {
        
            sum=sum+nums[i];
            if(sum>maxi)
            {
                maxi=sum;
            }
            if(sum<0)
            sum=0;
        }
        if(maxi<0)
        maxi=0;

        return maxi;
    }
}
