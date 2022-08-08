import java.util.*;
public class Collatz {
        public static void main(String args[]) {
            Scanner SC=new Scanner(System.in);
            System.out.println("Enter N");
            int n=SC.nextInt();
            System.out.println(n+" ");
            int count=0;
            while(n!=1)
            {
                if(n%2==0)
                {
                    n=n/2;
                    count++;
                }
                else
                {
                    n=3*n+1;
                    count++;
                }
                System.out.println(n);
            }
            System.out.println(count);
        }
    }
