import java.util.Scanner;
public class LabAllocation {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x\n");
        int x = sc.nextInt();
        System.out.println("Enter y\n");
        int y = sc.nextInt();
        System.out.println("Enter z\n");
        int z = sc.nextInt();
        System.out.println("Enter n\n");
        int n = sc.nextInt();
        int a=x-n;
        int b=y-n;
        int c=z-n;
        if(a<0&&b<0&&c<0)
            System.out.println("None of the labs can be allocated");
        else if(a<b&&a<c)
            System.out.println("L3 should be allocated to this class");
        else if(b<a&&b<c)
            System.out.println("L2 should be allocated to this class");
        else
            System.out.println("L1 should be allocated to this class");
    }
}
