//rearrange array element by sign
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

//You should rearrange the elements of nums such that the modified array follows the given conditions:

//1. Every consecutive pair of integers have opposite signs.
//2. For all integers with the same sign, the order in which they were present in nums is preserved.
//3. The rearranged array begins with a positive integer.

//brute force solution
// time complexity O(2n) ans space complexity O(n);

import java.util.Scanner;

public class Rearrange 
{
         public static void main(String[] args)
        {
               Scanner sc = new Scanner(System.in);
                 int n= sc.nextInt();
                 if(n%2!=0)
                 {
                    System.out.println("please!...enter even value");
                        n= sc.nextInt();            
                 }
                 int[] arr = new int[n];
                 int i;
                 System.out.println("enter positive and negative number in array ");
                 for( i=0;i<n;i++)
                  {
                    
                    arr[i]=sc.nextInt();
                
                  }
                  int[] ans=new int[n];
                  ans=rearrangeArray(arr);
                  for( i=0;i<n;i++)
                  {
                    System.out.print(ans[i]+" ");
                  }
                  sc.close();
        }
        public static int[] rearrangeArray(int[] nums) {
            
            int[] pos = new int[nums.length/2];
            int[] neg = new int[nums.length/2];
            int p=0,q=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>0)
                pos[p++]=nums[i];
                else
                neg[q++]=nums[i];
            }
            p=0;q=0;
            for(int i=0;i<nums.length;i++)
            {
                if(i%2!=0)
                nums[i]=neg[q++];
                else
                nums[i]=pos[p++];
            }
            return nums;

        }
} 
    

