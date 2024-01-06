//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
//such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//better solution 
//time complexity

import java.util.*;

public class Sum_3_betterSol {
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
           List<List<Integer>> ans= new ArrayList<>(); 
           ans=threeSum(arr);
            for (List<Integer> list : ans) {
                System.out.print("[");
                for (int list2 : list) {
                    System.out.print(list2+" ");
                }
                System.out.print("]");
            }
            System.out.println();
            sc.close();
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> hs = new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int third_element= -(nums[i]+nums[j]);
                 if (hs.contains(third_element)) {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],third_element);
                     temp.sort(null);
                     st.add(temp);
                 }
                 hs.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
     return ans;

    }
}
