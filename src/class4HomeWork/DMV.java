package class4HomeWork;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How Old are you?");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("congratulation!!,we will issue a driver's license to you!");
        }else{
            System.out.println("you need to get a learner permit first!!");
        }
    }
}
