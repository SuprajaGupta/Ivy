package Day2;
//Write a program to find the mean, median, mode of the elements in an array.
import java.util.*;
@SuppressWarnings("CStyleArrayDeclaration")
public class Statistics {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int s[]=new int[size];
            int count[] =new int[10];
            int sum=0;
            for(int i=0;i<size;i++){
                s[i]=sc.nextInt();
                sum+=s[i];
                count[s[i]]++;
            }
            //Mean

            System.out.println("mean is  :"+sum/size);

            //Median

            if(size%2==0){
                int median=s[size/2]+s[(size/2)+1];
                System.out.println("median is : "+median/2);
            }
            else{
                System.out.println("median is : "+s[size/2]);
            }

            //Mode
            int maximum=Integer.MIN_VALUE;
            for(int i=0;i<10;i++) {
                if (count[i] > maximum) {
                    maximum = i;
                }
            }
            System.out.println("mode is : "+maximum);

        }
    }




//public class OneArray {
//    public static void main(String args[])
//    {
//        int[] arr = new int[]{ 1,2,3,4,3};
//        int sum=0;
//        for(int i=0;i<5;i++)
//        {
//            sum=sum+arr[i];
//        }
//        System.out.println("Length "+arr.length);
//        int mean=sum/5;
//        System.out.println("mean is "+mean);
//        Arrays.sort(arr);
//        double median=arr[(arr.length)/2];
//        System.out.println("Median is "+median);
//        int maxVal=0, count=0, maxCount=0;
//
//        for(int i=0;i<5;i++) {
//            count = 0;
//            for(int j=0;j<5;j++) {
//                if(arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                maxVal = arr[i];
//            }
//        }
//        System.out.println("Mode is "+maxVal);
//
//    }
//}
//
