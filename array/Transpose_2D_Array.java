//transpose 2D array

import java.util.Scanner;

public class Transpose_2D_Array {
    public static void main(String[] arg)
{
    Scanner sc=new Scanner(System.in);
    
        System.out.println("enter size of row and columns:-");
    
        int row = sc.nextInt();  //user input
        int coloumn= sc.nextInt();
    
        int[][] arr=new int[row][coloumn]; //array creation
    
        System.out.println("enter elements in array:-");
       
       
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<coloumn;j++)      //using nested for loop for user input in 2d array
            {
                arr[i][j]=sc.nextInt();       
            }
        }
        
         transpose(arr);
        
        for(int[] i : arr)
        {
           for (int j: i) 
           {
                System.out.print(j+" "); 
           }
           System.out.println();
        }
        sc.close();
    }
    public static void transpose(int[][] nums)
    {
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            int temp=nums[i][j];
            nums[i][j]=nums[j][i];
            nums[j][i]=temp;
        }
       } 
       reverse_Array(nums);
       
    }
    public static void reverse_Array(int[][] nums) //reverse the transposed array
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length/2;j++)
            {
                int temp = 0;
                temp = nums[i][j];
                nums[i][j] = nums[i][nums.length - 1 - j];
                nums[i][nums.length - 1 - j] = temp;
               }
        }
    }
}

