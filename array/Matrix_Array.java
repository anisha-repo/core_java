//2d array
import java.util.Scanner;

public class Matrix_Array {
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
}
