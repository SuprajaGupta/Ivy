import java.util.Scanner;

public class WeeklySalary {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int bonus, bonusRate;
        int rate1 = 0, rate2= 0, rate3 =0, rate4 = 0, rate5 =0, rate6 = 0,  rate7 =0, rate8 = 0;
        int edays, totaldays, totalrate;

        int sun = sc.nextInt();
        int mon = sc.nextInt();
        int tue = sc.nextInt();
        int wed = sc.nextInt();
        int thurs = sc.nextInt();
        int fri = sc.nextInt();
        int sat = sc.nextInt();

        rate1 = sun * 150;
        rate7= sat*125;

        if(mon <= 8)
        {
            rate2 = mon * 100;
        }
        else if(mon > 8)
        {
            bonus = mon - 8;
            bonusRate = bonus * 115;
            rate2 = bonusRate + 800;
        }
        if(tue <= 8)
        {
            rate3 = tue * 100;
        }
        else if(tue > 8)
        {
            bonus = tue - 8;
            bonusRate = bonus * 115;
            rate3 = bonusRate + 800;
        }
        if(wed <= 8)
        {
            rate4 = wed * 100;
        }
        else if(wed > 8)
        {
            bonus = wed - 8;
            bonusRate = bonus * 115;
            rate4 = bonusRate + 800;
        }
        if(thurs <= 8)
        {
            rate5 = thurs * 100;
        }
        else if(thurs > 8)
        {
            bonus = thurs - 8;
            bonusRate = bonus * 115;
            rate5 = bonusRate + 800;
        }
        if(fri <= 8)
        {
            rate6 = fri * 100;
        }
        else if(fri > 8)
        {
            bonus = fri - 8;
            bonusRate = bonus * 115;
            rate6 = bonusRate + 800;
        }

        totaldays = mon + tue + wed + thurs + fri;
        if(totaldays > 40)
        {
            edays = totaldays - 40;
            rate8 = edays * 25;
        }
        totalrate = rate1 + rate2 + rate3 + rate4 + rate5 + rate6 + rate7 + rate8;
        System.out.println("Total Salary is " +totalrate);

    }
}
