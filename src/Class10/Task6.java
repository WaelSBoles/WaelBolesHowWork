package Class10;

public class Task6 {
    public static void main(String[] args) {
        /* Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries, african countries.Then print all values from that array using 2 different loops
        and calculate how many total countries been stored.
         */
        String[][] countries = {{"United States", "Mexico", "Canada", "Guatemala", "Cuba"},
                {"Argentina", "Chile", "Colombia", " Brazil", "Uruguay"},
                {"Germany", "England", "France", "Italy", "Greece"},
                {"China", "India", "Thailand", "Philippine", "Vietnam"},
                {"Egypt", "Sudan", "Libya", "South Africa", "Tunisia"}

        };
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println();
        for (String[] county : countries) {
            for (String s : county) {
                System.out.print(s + " ");

            }
            System.out.println();
        }
        System.out.println("Total countries:" + sum);
    }
}

