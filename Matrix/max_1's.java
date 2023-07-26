import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int row,col;
        System.out.println("Enter rows: ");
        row=s.nextInt();
        System.out.println("Enter columns: ");
        col=s.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int res=maximum(arr);
        System.out.println(res+" row has maximum num. of 1's");
        
    }
    static int maximum(int[][] arr)
    {
        int row=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j] == 1)
                {
                    count++;
                }
            }
            if(max<count)
            {
                max=count;
                row=i;
                
            }
        }
        return row;

    }
}