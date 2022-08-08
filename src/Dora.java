import java.util.*;
public class Dora {
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=SC.nextInt();
        System.out.println("Enter no of columns");
        int m=SC.nextInt();
        System.out.println("Enter the tree number");
        int tno=SC.nextInt();
        int[][] mat = new int[n][m];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                mat[i][j]=SC.nextInt();
            }
        }
        i=0;
        for(j=0;j<m;j++)
        {
            if(mat[i][j]==tno)
            {
                System.out.println("Yes");
            }

        }
        j=0;
        for(i=0;i<n;i++)
        {
            if(mat[i][j]==tno)
            {
                System.out.println("Yes");
            }

        }
        j=m-1;
        for(i=0;i<n;i++)
        {
            if(mat[i][j]==tno)
            {
                System.out.println("Yes");
            }

        }
    }
}