//Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

//If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
//optimal solution
//time complexity

import java.util.Scanner;

public class Next_Permutation {
     public static void main(String[] arg)
    {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr = new int[n];
       int i;
       System.out.println("enter elements:-");
        
       for( i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       nextPermutation(arr);
      
       System.out.println("next permutation:-");
      for (int j : arr) {
        System.out.print(j+" ");
      }
    sc.close();
    }
    public static void nextPermutation(int[] nums) {
       int index=-1,index2=-1;  //break point;
       for(int i=nums.length-2;i>=0;i--)
       {
        if(nums[i]<nums[i+1])
        {
            index=i;
            break;
        }
       } 
          if(index==-1)
          {
          reverse(nums,0);
          }
       
       for(int i=nums.length-1;i>index;i--)
       {
          if(nums[i]>nums[index])
          {
            index2=i;
                break;
          }
       }
       swap(nums, index, index2);
       reverse(nums, index+1);
    
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
   public static void reverse(int[] nums,int start) {
        int j=nums.length-1;
       
        int i=start;
       
        while (i<j) 
        {
        
            swap(nums, i, j);
            i++;
            j--;

        }

    }
   

   
}
