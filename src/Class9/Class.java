package Class9;

public class Class {
    public static void main(String[] args) {

        int[] num = {54, 654, 12, 354, 32, 455};
        int largest = 0;
        for (int i = 0; i < num.length; i++) {
            if (i > largest) {
                System.out.println(largest);
                largest =i;
            }

        }
    }

}

