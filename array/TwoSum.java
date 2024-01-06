/*this is the better solution for the Two sum problem in which the method twoSum has to return the
  index of those nummber of array whose sum is equal to target . */
  //here i use hashmap data structure
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
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
            System.out.println("enter target  ");
            int target=sc.nextInt();
            int[] index=new int[2];
            index=twoSum(arr,target);
            System.out.println("the index are:-" + index[0] + " and "+ index[1]);
            sc.close();
    }
   
   public static int[] twoSum(int[] nums, int target) {
    int[] ans=new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();/*key value is element of arar and value is index of the element*/

    for(int i=0;i<nums.length;i++)
    {
        int num=nums[i];
        int other_num=target-num;
        if(mp.containsKey(other_num))
        {
            ans[0]=i;
            ans[1]=mp.get(other_num);
            return ans;
        }
        mp.put(nums[i],i);
    }
    
    return ans;

}
}
