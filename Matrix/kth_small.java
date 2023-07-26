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
        int mat[][]=new int[row][col];
        System.out.println("Enter matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        int k;
        System.out.println("enter k value: ");
        k=s.nextInt();
        int res=kth(mat,row,col,k);
        System.out.println("kth smallest element is "+res);
        
    }
    static int kth(int mat[][],int row,int col,int k)
    {
        int temp[]=new int[row*col];
        int pos=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                temp[pos]=mat[i][j];
                pos++;
            }
        }
        Arrays.sort(temp);
        return temp[k-1];
        
    }
}