package HomeWork;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("what's your Quiz Score?");
        int quiz=scan.nextInt();
        System.out.println("what's your mid term score?");
        int midTerm=scan.nextInt();
        System.out.println("what are your final Scores");
        int finalScore=scan.nextInt();
        int averageScore=(quiz+midTerm+finalScore)/3;
        if(averageScore>=90){
            System.out.println("A");
        }else if (averageScore>=70 && averageScore<90){
            System.out.println("B");
        }else if (averageScore>=50 && averageScore<70){
            System.out.println("C");
        }else if(averageScore<50 ){
            System.out.println("F");
        }


    }
}
