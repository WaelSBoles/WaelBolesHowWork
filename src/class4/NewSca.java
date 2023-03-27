import java.util.Scanner;

public class NewSca {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("what is your Name?");
        String name = scanner.nextLine();
        System.out.println("how old are you?");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favorite food ");
        String food=scanner.nextLine();


        System.out.println("Hello "+name);
        System.out.println("you are"+age+"years old");
        System.out.println("you like"+food);


    }
}
