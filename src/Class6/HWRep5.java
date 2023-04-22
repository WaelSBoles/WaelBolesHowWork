package Class6;

import java.util.Scanner;

public class HWRep5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        if(num>0){
            System.out.println(num+ " is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else if (num==0){
            System.out.println("Entered number is equals to 0");
        }
    }

}
