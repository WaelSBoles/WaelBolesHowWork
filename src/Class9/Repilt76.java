package Class9;

import java.util.Scanner;

public class Repilt76 {
    public static void main(String[] args) {

        String[] weekdays = new String[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < weekdays.length; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            weekdays[i] = scanner.nextLine();
        }

        for (String day : weekdays) {
            System.out.println(day);
        }


    }


    }

