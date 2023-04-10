package Class9;

public class HW7Class9 {
    public static void main(String[] args) {
        //From an array of integer elements find the largest number.

        int[] num = {10, 15, 20, 30, 100};
        int largest = 0;
        for (int i : num) {
            if (i > largest) ;

            largest = i;

        }
        System.out.println(largest);
    }
}
