package HomeWork;

import java.util.Scanner;

public class Replit310 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny = scan.nextBoolean();
        if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
        }
        if (!isSunny) {
            System.out.println("I stay home and practice Java");
        }
        System.out.println("What is the temperature outside?");
        int temperature = scan.nextInt();
        if (temperature >= 85) {
            System.out.println("I am going to the beach");
        } else if (temperature < 85) {
            System.out.println("I am going to the park!");
        }
    }

}

