package class4HomeWork;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        /* 2) You are a loan specialist and you need to ask user what is the amount of loan
          is needed. If loan is less or equal to 200,000 then you would lend the money
           otherwise you would reject the client.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the amount of loan is need? ");
        int loan= scanner.nextInt();
        if(loan<=200000){
            System.out.println("Congratulation, We would lend you the loan!");
        }
        else{
            System.out.println("Sorry,we would reject the loan");
        }

    }
}
