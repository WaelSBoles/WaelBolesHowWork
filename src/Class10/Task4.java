package Class10;

public class Task4 {
    /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.*/
    public static void main(String[] args) {
        int [][] nums={{5,15,20},
                        {25,30,35},
                        {40,45,50}
        };
        int  sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length ; j++) {
                sum=sum+nums[i][j];
            }
        }
        System.out.println(sum);
        }

        }

