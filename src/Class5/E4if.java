package Class5;

import java.util.Scanner;

public class E4if {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" can we go out true/false?");
        boolean goingOut=scan.nextBoolean();
        if (goingOut){
            System.out.println("Yay, we are going out");
        }else {
            System.out.println("we will stay Home");
        }

    }
}
