package Class9;

public class E5arrays {
    public static void main(String[] args) {

        int [] nums={10,50,60,45,100};
        for (int i = 1; i < nums.length; i+=2) { // to get the odd number we need to use i=1 in the first step and
                                                  // in the increment we use i+=2 which is !i%2==0 or i%2==1
            System.out.println(nums[i]+" ");

        }
    }
}
