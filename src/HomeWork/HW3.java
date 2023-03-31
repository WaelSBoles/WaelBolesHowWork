package HomeWork;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What's the time now?");
        double time=input.nextDouble();
        if(time>=1 && time<=11){
            System.out.println("It is morning Time!");
        }else if (time >=12 && time<=15){
            System.out.println("It is Afternoon time!");
        }else if(time>=16 && time<=20){
            System.out.println("It is Evening time!");
        }else if (time >=21&& time <=24 ){
            System.out.println("It's night time!");
        } else {
            System.out.println("Stay in the bed");
        }
        }




    }

