//rotate array by 90 degree
//brute force solution
//time complexity O(n^2) and space complexity O(n^2)
import java.util.Scanner;

public class RotateImage {
    public static void main(String[] arg)
    {
         Scanner sc=new Scanner(System.in);
    
        System.out.println("enter size of row ");
    
        int row = sc.nextInt();  //user input
    
        int[][] arr=new int[row][row]; //array creation
    
        System.out.println("enter elements in array:-");
       
       
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)      //using nested for loop for user input in 2d array
            {
                arr[i][j]=sc.nextInt();       
            }
        }
     int[][] ans=new int[row][row];
     ans= rotate(arr,row);
        for(int[] i : ans)
        {
           for (int j: i) 
           {
                System.out.print(j+" "); 
           }
           System.out.println();
        }
        sc.close();
    }
    public static int[][] rotate(int[][] matrix,int n) {
        
        int[][] temp=new int[n][n];
        int i=0,j=0;
        for( i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                temp[j][n - i - 1]=matrix[i][j];
            }
           
        }
        return temp;
    }
}
