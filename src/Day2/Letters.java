package Day2;
import java.util.*;
import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=Sc.nextLine();
        StringBuffer newStr=new StringBuffer(str);

        for(int i = 0; i < str.length(); i++) {

            if(Character.isLowerCase(str.charAt(i))) {

                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }

            else if(Character.isUpperCase(str.charAt(i))) {

                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("New String is  : " + newStr);
    }
}


