package HomeWork;

import java.util.Scanner;

public class Replit32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender M or F");
        char gender=input.next().charAt(0);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        if(age>25 && gender=='F'){
            System.out.println("Woman");
        }if (age>25 && gender=='M'){
            System.out.println("Man");
        }if (age<25 && gender=='F'){
            System.out.println("Girl");
        }if (age<25 && gender=='M'){
            System.out.println("Boy");
        }

    }
}
