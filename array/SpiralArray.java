//Given an m x n matrix, return all elements of the matrix in spiral order.

import java.util.*;



public class SpiralArray {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int row=matrix.length;
        int coloumn=matrix[0].length;
       
        int top=0,bottom=row-1,right=coloumn-1,left=0;
 
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
               ans.add(matrix[top][i]);
              
               top++;
            
            for(int i=top;i<=bottom;i++)
            
                ans.add(matrix[i][right]);
                
                right--;
            

            if (top <= bottom)
            {
               for(int i=right;i>=left;i--)
               ans.add(matrix[bottom][i]);
            
               bottom--;
            }

           if(left<=right)
           {
            for(int i=bottom;i>=top;i--)
            
              ans.add(matrix[i][left]);
            
              left++;
           }

        }

        return ans;

    }
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

       System.out.println("2D array:-");
       
       for (int[] is : arr) {
            for(int s : is)
            {
                System.out.print(s+" ");
            }
            System.out.println();
        }
        List<Integer> ans=new ArrayList<>();
      ans=spiralOrder(arr);
      System.out.println("Spiral array");
       
      for (Integer integer : ans) {
        System.out.print(integer+" ");
      }
      sc.close();

    }
}
