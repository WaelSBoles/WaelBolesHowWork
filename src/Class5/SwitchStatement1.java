package Class5;

public class SwitchStatement1 {
    public static void main(String[] args) {

        // The default keyword specifies some code to run if there is no case match(it's like else with if)
        //Note that if the default statement is used as the last statement in a switch block, it does not need a break.
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wends day");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            default:
                System.out.println("is not in the calender!");
        }
    }
}
