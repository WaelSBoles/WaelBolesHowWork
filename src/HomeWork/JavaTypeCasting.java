package HomeWork;

public class JavaTypeCasting {
    public static void main(String[] args) {

        int age=20;
        double life=age;
        System.out.println(age);
        System.out.println(life);

        int car=6000;
        double price=car;
        System.out.println(car);
        System.out.println(price);

        double house=562.5368;
        int porch=(int) house;  // Manual casting: double to int
        System.out.println(house);
        System.out.println(porch);

    }
}
