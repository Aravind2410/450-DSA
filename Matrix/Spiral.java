import java.util.Scanner;
class Main
{
    static void spiral(int arr[][], int row,int col)
    {
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.println(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                System.out.println(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.println(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i<=top;i++)
                {
                    System.out.println(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int row,col;
        System.out.println("Enter row: ");
        row=s.nextInt();
        System.out.println("Enter col: ");
        col=s.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("The spiral matrix is:");
        spiral(arr,row,col);
    }
}