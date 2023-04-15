package Class10;

public class Task3 {
    public static void main(String[] args) {
       /*Using 2D array create a grocery list.
          Inside you should have an array of veggies, fruits, dairy and sweets.
         Retrieve all values from that array using 2 different loops
        */

        String [][] grocery={{"Broccoli","Garlic","Kale" },
                             {"Strawberry","Orange","Apple"},
                              {"Milk","Yogurt","Cheese"},
                              {"Apple Pie","Rice Pudding","Cake"}
        };
        for (String[] strings : grocery) {
            for (String string : strings) {
                System.out.print(string+" ");

            }
            System.out.println();

        }
        System.out.println("+++++++++++++++++++++");
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");

            }
            System.out.println();
        }

    }
}
