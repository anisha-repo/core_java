// subarray with the largest sum
//brute force solution
//using nested for loop
//time complexity O(n^2)
//space complexity O(1)
import java.util.Scanner;
public class MaxiMumSubarray {
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
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
              sum=sum + nums[i];
            maxi=  Math.max(maxi,sum);
            }
        }
        return maxi;
    }
}
