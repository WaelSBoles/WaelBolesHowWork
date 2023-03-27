package class4HomeWork;

import java.util.Scanner;

public class City1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what City you live in?");
        String city=scan.next();
        System.out.println("enter the temperature of your city");
        double temp=scan.nextDouble();
        double  celsius=(temp-32)*5/9;
        System.out.println(" you are in the city of "+ city+" is "+celsius);

    }
}
