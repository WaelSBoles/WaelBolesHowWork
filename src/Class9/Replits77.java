package Class9;

import java.util.Scanner;

public class Replits77 {
    public static void main(String[] args) {
        int [] nums=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=scanner.nextInt();


        }
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);

        }
    }
}
