package Day2;

import java.util.*;
import java.util.Arrays;

public class Marks {

        public static void main(String args[])
        {
            int rows, column, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            rows = sc.nextInt();
            System.out.print("Enter total subjects : ");
            column = sc.nextInt();
            int arr[][] = new int[rows][column];
            int sumOfArray[]  = new int[rows];
            for(int i =0; i < rows; i++)
            {
                System.out.println("Enter  marks of the students" + (i+1) + " : ");
                for(int j=0; j < column ; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    sum += arr[i][j];
                }
                System.out.println("Student " + (i+1) + "= "  + sum);
                sumOfArray[i] = sum;
                sum = 0;
            }

            for(int i = 0; i<sumOfArray.length; i++)
            {
                sum += sumOfArray[i];
                if(sumOfArray[i] <= 50)
                    System.out.println("Lowest performance  : student " + (i+1) + " - "+ sumOfArray[i]);
            }
            System.out.println("Total class average " + sum/rows);
            Arrays.sort(sumOfArray);
            for(int j =0; j< sumOfArray.length ; j++)
            {
                System.out.println("Rank - " + (j+1)+ " " +  sumOfArray[j] + " " );
            }
        }
    }

