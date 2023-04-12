package Class5;

public class E4 {

    public static void main(String[] args) {


        //Create a variable store the value money inside tha variable
        //write if-else if money is grater than 10000 program should check another condition for example it should check what
        //day is today if the day is Sunday it  should say let's go shopping

        int money = 2000;
        String day = "Sunday";

        if (money > 10000)
            if (day.equals("Sunday")) {
                System.out.println("let's go shopping");
            } else {
                System.out.println("we stay at Home");
            } else {
            System.out.println("let's save more");
        }


    }
}
