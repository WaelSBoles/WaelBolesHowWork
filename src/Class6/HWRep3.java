package Class6;

import java.util.Scanner;

public class HWRep3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input the boolean value true/false");
        boolean areYouSleeping=scan.nextBoolean();
        if (areYouSleeping){
            System.out.println("The value is true");
        }else {
            System.out.println("The value is false");
        }


    }
}
