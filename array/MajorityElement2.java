//*Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// better solution using HashMap
//time complexity is O(N*logN) + O(N),where n is the size of array
//space complexity is O(n);
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement2 {
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
        HashMap<Integer,Integer> mp = new HashMap<>();
          
     for(int i=0;i<nums.length;i++)
     {
        int value = mp.getOrDefault(nums[i], 0);
            mp.put(nums[i], value + 1);
     }
     for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() > (nums.length/ 2)) {
                return it.getKey();
            }
     return -1;
    }
    return -1;
}
}
