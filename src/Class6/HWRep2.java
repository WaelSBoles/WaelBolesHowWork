package Class6;

import java.util.Scanner;

public class HWRep2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.nextLine();
        System.out.println("Enter your mobile number");
        String phoneNum=scan.next();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+ phoneNum);
    }
}