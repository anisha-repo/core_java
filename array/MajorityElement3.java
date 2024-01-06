//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// optimal solution using moore’s Voting Algorithm:
//time complexity is O(2n) i.e O(n) and space complexity is O(1)

import java.util.Scanner;

public class MajorityElement3 {
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
    public static int majorityElement(int[] nums)
    {
        int count=0,ele=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                count=1;
                ele=nums[i];
            }
            else if(nums[i]==ele)
            count++;
            else
            count--;
        }
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                count1++;
            }
           
        }
        if(count1>(nums.length/2))
        {
            return ele;
        }
        return -1;
    }
    
}
