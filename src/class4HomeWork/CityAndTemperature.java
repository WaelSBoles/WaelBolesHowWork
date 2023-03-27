package class4HomeWork;

import java.util.Scanner;

public class CityAndTemperature {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("which city you live in?");
        String city=scanner.next();
        System.out.println("Enter the temperature in your City in Fahrenheit?" );
        double temp=scanner.nextDouble();
        double Celsius=(temp-32)*5/9;
        System.out.println("the temperature in the city of " +city + "is " +Celsius);



    }

}
