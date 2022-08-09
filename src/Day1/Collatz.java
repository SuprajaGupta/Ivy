package Day1;
import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n+" ");
        while(n>1)
        {
            if(n%2==0){
                System.out.print(n/2+"->");
                n=n/2;
            }
            else{
                System.out.print((3*n+1)+"->");
                n=3*n+1;
            }
        }
    }
}

//import java.util.Scanner;
//public class Collatz {
//    public static void main(String args[]) {
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter the no :");
//        int number = Sc.nextInt();
//
//        while (number != 1) {
//            System.out.println(number + " ");
//
//
//            if ((number & 1) == 1)
//                number = number * number + 1;
//
//
//            else
//                number = number / 2;
//        }
//
//        // Print 1 at the end
//        System.out.print(number);
//    }
//}

//import java.util.*;
//public class Day1.Collatz {
//        public static void main(String args[]) {
//            Scanner sc =new Scanner(System.in);
//            System.out.println("Enter Number ");
//            int num=sc.nextInt();
//            System.out.println(num+" ");
//            int count=0;
//            while(num!=1)
//            {
//                if(num%2==0)
//                {
//                    num=num/2;
//                    count++;
//                }
//                else
//                {
//                    num=3*num+1;
//                    count++;
//                }
//                System.out.println(num);
//            }
//            System.out.println(count);
//        }
//    }
