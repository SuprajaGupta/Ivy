package Day2;
//Length of String
//Merge two strings
//Split and print the strings
//Reverse a string
//find if two strings are equal when two different strings are given.

import java.util.Scanner;
public class StringOperations {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String a= sc.next();
            String b= sc.next();
            System.out.println("length of 2 strings is : "+a.length()+","+b.length());
            System.out.println("concatenation of 2 strings is : "+a.concat(b));
            String A[]=a.split("@",1);
            for(String i:A){
                System.out.println(i);
            }
            StringBuffer sb=new StringBuffer(a);
            System.out.print(sb.reverse());
            if(a.equals(b)){
                System.out.println("equal");
            }
            else{
                System.out.println("not equal");
            }

        }
}



