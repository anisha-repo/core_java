//*Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// brute force solution
//time complexity is O(n^2) and space complexity is O(1);
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
            int[] arr = new int[n];
            int i;
            System.out.println("enter number in array ");
            for( i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();

            }
            int ans= majorityElement(arr);
            System.out.println(ans + " majority element");
            sc.close();
    }
    public static int majorityElement(int[] nums) {
          
     for(int i=0;i<nums.length;i++)
     {
        int count=0;
        for(int j=i+1;j<nums.length;j++)
        {
             if(nums[i]==nums[j])
             {
                count++;
             }
        }
        if(count>(nums.length/2))
        {
            return nums[i];
        }
     }
     return -1;
    } 
}
