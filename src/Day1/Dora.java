package Day1;

import java.util.Scanner;
public class Dora {
    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int number = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            if (number == i) {
                k = 1;
                break;
            }
        }
        for (int i = row; i <= col * row; i = i + row) {
            if (number == i) {
                k = 1;
                break;
            }
        }
        for (int i = 1; i <= (row*(col - 1) + 1); i = i + row) {
            if (number == i) {
                k = 1;
                break;
            }
        }
        if (k == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


//import java.util.Scanner;
//public class Dora {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int r=sc.nextInt();
//        int c=sc.nextInt();
//        int m=sc.nextInt(); int flag=0;
//        for(int i=0;i<r;i++){
//            if(r*(i)+1==m) {
//                System.out.print("Yes");
//                break;
//            }
//            for(int j=0;j<c;j++){
//                if(m==c*(j)+r) {
//                    System.out.println("Yes");
//                    flag=1;
//                }
//                else if(i==0 && j+1==m){
//                    System.out.println("Yes");
//                    flag=1;
//                }
//                if(flag==1){
//                    break;
//                }
//            }
//
//        }
//    }
//}