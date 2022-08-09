package Day2;

class Parent extends PolymorphismDemo{
    public static void add(int a,int b){
        //return 10;
        System.out.println("parent");
    }
    public static void main(String[] args){
        //System.out.println(add(1,2));
        add(1,2);

    }
}
public class PolymorphismDemo {

    public static void add(int number1,int number2){
        System.out.println("Child" +number1+number2);

    }
//    public static int add(int number1,int number2){
//        System.out.println(number1+number2);
//        //return(number1+number2);
//    }

}
