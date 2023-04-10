package Class9;

public class HW6Class9 {
    public static void main(String[] args) {
       /* Create an array on integers and calculate the sum of all elements in an array*/

        int [] nums={10,20,50,100};
        int sum=0;
        for (int i = 0; i <nums.length; i++) {
            System.out.println(nums[i]);
            sum=sum+nums[i];



        }
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println(sum);
    }



}
