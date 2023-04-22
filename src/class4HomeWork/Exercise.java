package class4HomeWork;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your Name?");
        String name = scan.next();
        System.out.println("your an awesome girl " + name);
        System.out.println("How are you?");
        String status = scan.next();

        System.out.println("my name is " + name + " and " + status);
        String Sent = scan.nextLine();


    }
}
