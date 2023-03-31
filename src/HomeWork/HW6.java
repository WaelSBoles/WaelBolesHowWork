package HomeWork;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Counter?");
        String country = input.nextLine();
        if (country.equals("USA") || country.equals("England") || country.equals("Canada")) {
            System.out.println("you are speaking English!");
        } else if (country.equals("France") || country.equals("Belgium") || country.equals("Swizerland")) {
            System.out.println("you are Speaking French");
        } else if (country.equals("Italy")) {
            System.out.println("you are speaking Italian!");
        } else if (country.equals("Egypt") || country.equals("Lebenon") || country.equals("Syria") || country.equals("Morcco")) {
            System.out.println("you are Speaking Arabic");
        }
    }
}
