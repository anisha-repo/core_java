/*this program will sort 0 1 and 2 in array,the element in array is only zero ,one and two
 * here,i use Dutch national flag algorithm
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SortZeroOnes {
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
           ArrayList<Integer> arr = new ArrayList<>();
            int i;
            System.out.println("enter 0 1 and 2  in array ");
            for( i=0;i<n;i++)
            {
                int j=sc.nextInt();
                arr.add(j);

            }
            sortArray(arr, n);
            for(i=0;i<n;i++)
            {
                System.out.print(arr.get(i)+" ");
            }

        }
         public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low=0,mid=0,high=n-1,temp;
        while(mid<=high)
        {
            if(arr.get(mid)==0){
                temp=arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);
                low++;
                mid++;
            }
            else if(arr.get(mid)==1)
           {
               mid++;
           }
            else {
            temp=arr.get(mid);
            arr.set(mid,arr.get(high));
            arr.set(high,temp);
            high--;
            }
        }
    }
}