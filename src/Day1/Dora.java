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