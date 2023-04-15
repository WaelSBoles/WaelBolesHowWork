package Class10;

public class Task2 {
    public static void main(String[] args) {
         /*Create 2D array of cars : american, german, korean, italian. Then retrieve
    all values from that array using 2 different loops
     */
        String [][] cars={{"Chevy","Ford","Buick","GMC"},
                           {"Mercedes","BMW","VW","Opel"},
                            {"Hyundai","Kia","Daewoo"},
                            {"Ferrari","Maserati","Fiat","Lamborghini"}
        };
        for (int i = 0; i <cars.length ; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++");
        for (String[] car : cars) {
            for (String model : car) {
                System.out.print(model + " ");
            }
            System.out.println();
        }


        }
            }




