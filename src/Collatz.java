import java.util.*;
public class Collatz {
        public static void main(String args[]) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Number ");
            int num=sc.nextInt();
            System.out.println(num+" ");
            int count=0;
            while(num!=1)
            {
                if(num%2==0)
                {
                    num=num/2;
                    count++;
                }
                else
                {
                    num=3*num+1;
                    count++;
                }
                System.out.println(num);
            }
            System.out.println(count);
        }
    }
