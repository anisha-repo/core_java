//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.

 //brute force solution
 //time complexity O(N^3) and space complexity O(1);

import java.util.Scanner;

public class SubArray{
    public static void main(String[] arg)
    {
        System.out.println("enter size of array:-");
        Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         int[] arr=new int[n];
        System.out.println("enter elements in arary");
         for(int i=0;i<n;i++)
         {
               arr[i]=sc.nextInt();
         }
         System.out.println("enter target:-");
         int target=sc.nextInt();
         int ans = subArraySum(arr,target);
         System.out.println("total number of subrray "+ ans);
         sc.close();

    }
    public static int subArraySum(int[] nums, int target) {
      
        int count=0;
        for(int i=0;i<nums.length;i++)
        { 
            int sum=0;                      //for better solution
            for(int j=i;j<nums.length;j++)
            {
               //int sum=0;
              //  for(int k=i;k<=j;k++)    //this is for brute force solution
                
                   sum=sum+nums[j];
                if(sum==target)
                {
                   count++;  
                }
            }
        }
        return count;

    }
}