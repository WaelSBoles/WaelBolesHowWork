package Class6;

import java.util.Scanner;

public class HWRep6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote ");
        }





    }
}
