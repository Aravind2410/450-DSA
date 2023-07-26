import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int row,col;
        System.out.println("Enter rows: ");
        row=s.nextInt();
        System.out.println("Enter cols: ");
        col=s.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int res=median(arr);
        System.out.println("\nThe median is: "+res);
        
        
        
    }
    static int median(int arr[][])
    {
        int row=arr.length;
        int col=arr[0].length;
        int temp[]=new int[row*col];
        int pos=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                temp[pos]=arr[i][j];
                pos++;
            }
        }
        Arrays.sort(temp);
        int medIndex = pos/2;
        return temp[medIndex];
    }
}