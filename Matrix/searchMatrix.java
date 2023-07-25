import java.util.Scanner;
class Main
{
    static void search(int arr[][],int r,int c,int ele)
    {
        boolean present = false;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j] == ele)
                {
                    present = true;
                    System.out.println("Yep Element present at:"+i+" "+j);
                }   
            }
        }
        if(!present)
        {
            System.out.println("Not present!!!");
        }
        
        
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r,c;
        System.out.println("Enter rows: ");
        r=s.nextInt();
        System.out.println("Enter cols: ");
        c=s.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the matrix:\n");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        
        int ele;
        System.out.println("\nEnter the element to search:");
        ele=s.nextInt();
        search(arr,r,c,ele);
    }
}