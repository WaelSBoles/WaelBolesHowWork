package HomeWork;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth month?");
        String month = scan.next();
        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("you were born in season of Winter");
        } else if (month.equals("March") || month.equals("April") || month.equals("May)")) {
            System.out.println("you were born in season of Spring");
        } else if (month.equals("june") || month.equals("July") || month.equals("August")) {
            System.out.println("you were born in season of summer");
        } else if (month.equals("September") || month.equals("october") || month.equals("November")) {
            System.out.println("you were bon in the season of Fall");
        }

    }
}
