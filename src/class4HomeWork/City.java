package class4HomeWork;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("in which city do you live ?");
        String city=scan.next();
        System.out.println("enter your city Temperature");
        double temper=scan.nextDouble();
        double celtemp=(temper-32)*5/9;
        System.out.println("the Temperature in the city "+ city +" is "+ celtemp );







    }
}
