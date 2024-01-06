//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//better solution
//time complexity O(N*LogN) and space complexity o(N);

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Majority_Element2 {
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
            List<Integer> ans = new ArrayList<>();
            ans=majorityElement(arr);
            System.out.println(ans + " majority element");
            sc.close();
    }

    public static List<Integer> majorityElement(int[] nums)
     {
      
        List<Integer> ans = new ArrayList<>();
       
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
       
        int min = (int)(nums.length/2)+1;
      
       for(int i=0;i<nums.length;i++)
        {
       
        int value=mp.getOrDefault(nums[i],0);
        mp.put(nums[i],value+1);

            if (mp.get(nums[i])==min) 
            {
            ans.add(nums[i]); 
            }
        }
        return ans;
    }
}
