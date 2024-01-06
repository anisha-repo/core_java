//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//brute force solution
//time complexity O(n^2) and space ccomplexity o(1);
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Majority_Element {
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
     public  static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
          for(int i=0;i<nums.length;i++)
          {
        
            if(list.size()==0 || list.get(0)!=nums[i])
             {
                int count=1;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    count++;
                }


                if(count>(nums.length/3))
                {
                    list.add(nums[i]);
                }
             }

             if(list.size()==2)
             break;
          }
          return list;
    }
}
