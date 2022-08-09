package Day1;

import java.util.*;
public class Triangle {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            char x=sc.next().charAt(0); // 1st character
            char y=sc.next().charAt(0); // 2nd character
            int n=sc.nextInt(); // no. of lines
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(x);
                }
                for(int k=n-1;k>=i;k--){
                    System.out.print(y);
                }
                System.out.println();
            }
        }
    }

