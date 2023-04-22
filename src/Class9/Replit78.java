package Class9;

import java.util.Scanner;

public class Replit78 {
    public static void main(String[] args) {
        int [] array=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i]=scanner.nextInt();



        }
        for (int a = 0; a <array.length ; a++) {
            System.out.println(array[a]*10);

        }
    }
}
