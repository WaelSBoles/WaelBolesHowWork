package HomeWork;

import java.util.Scanner;

public class Replit29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x=input.nextInt();
        System.out.println("Please enter second number");
        int y=input.nextInt();
        int mult=x*y;
        if(mult>=0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }
}
