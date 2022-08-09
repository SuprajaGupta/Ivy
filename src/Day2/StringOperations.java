package Day2;
//Length of String
//Merge two strings
//Split and print the strings
//Reverse a string

import java.util.Scanner;
public class StringsOperations {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s1= sc.next();
            String s2= sc.next();
            System.out.println("length of 2 strings "+s1.length()+","+s2.length());
            System.out.println("concatenation of 2 strings: "+s1.concat(s2));
            String a[]=s1.split("@",1);
            for(String i:a){
                System.out.println(i);
            }
            StringBuffer sb=new StringBuffer(s1);
            System.out.print(sb.reverse());

        }
    }

