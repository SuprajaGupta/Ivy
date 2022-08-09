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



//public class Letters {
//
//    public static void main(String[] args) {
//        Scanner Sc=new Scanner(System.in);
//        System.out.println("Enter the String ");
//        String str=Sc.nextLine();
//        StringBuffer newStr=new StringBuffer(str);
//
//        for(int i = 0; i < str.length(); i++) {
//
//
//            if(Character.isLowerCase(str.charAt(i))) {
//
//                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
//            }
//
//            else if(Character.isUpperCase(str.charAt(i))) {
//
//                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
//            }
//        }
//        System.out.println("New String after Case  : " + newStr);
//    }
//}




//        public static void main(String[] args)
//        {
//            Scanner sc =new Scanner(System.in);
//            System.out.println("Enter a String");
//            String str= sc.nextLine();
//            String s = " ";
//            for(int i=0;i<s.length();i++)
//            {
//                if(isLowerCase(str.charAt(i)))
//                {
//                    s=s+toUpperCase(str.charAt(i));
//                }
//                else {
//                    s=s+toLowerCase(str.charAt(i));
//                }
//            }
//            System.out.println(s);
//        }
//    }


