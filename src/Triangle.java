import java.util.*;
public class Triangle {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            char x=sc.next().charAt(0);
            char y=sc.next().charAt(0);
            int n=sc.nextInt();
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

