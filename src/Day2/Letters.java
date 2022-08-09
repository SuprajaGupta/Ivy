package Day2;
import java.util.*;

public class Letters {
       public static StringBuffer swapCase(String s)
        {
        StringBuffer str =new StringBuffer(s);
        for (int i = 0; i < str.length(); i++) {
        Character c = str.charAt(i);
        if (Character.isLowerCase(c))
        str.replace(i, i + 1,Character.toUpperCase(c) + "");
        else
        str.replace(i, i + 1,Character.toLowerCase(c) + "");
        }
        return str;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println("String after swapping cases is "+(swapCase(string)));
        }

        }



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


