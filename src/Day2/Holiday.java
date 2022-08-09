package Day2;

public class Holiday {
    private String name;
    private int day;
    private String month;
    // your code goes here
    Holiday(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static Boolean inSameMonth(Holiday h1,Holiday h2){
        if(h1.month.equals(h2.month)){
            return true;
        }
        return false;
    }
    public Double avgDate(Holiday h[]) {
        double avg = 0;
        for (int i = 0; i < h.length; i++) {
            this.day = h[i].day;
            avg += this.day;
        }
        return (double) avg / h.length;
    }

    public static void main(String[] args) {
        Holiday h1=new Holiday("Independence Day",4,"August");
        Holiday h2=new Holiday("Republic Day",26,"January");
        System.out.println(Holiday.inSameMonth(h1,h2));
        System.out.print(h1.name);

    }
}