package Class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the temperature");
        double temp= scan.nextDouble();
        boolean nice=true;
        if(nice){
            System.out.println("we are going out");
        } else {
            System.out.println("we will stay Home");
        }
    }
}
