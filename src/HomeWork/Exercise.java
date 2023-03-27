package HomeWork;

public class Exercise {
    public static void main(String[] args) {

        int x=10;
        int y= 15;
        System.out.println(x > y);
        System.out.println(y > x);
        System.out.println( x == y);
        System.out.println(x != y);
        System.out.println( y >= x);
        System.out.println( x <= y);

        int w=10;
        System.out.println(w > 8 && w <20); // && logic and-returns true because 10 is greater than 8 AND 10 is less than 20

        int e=5;  //returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        System.out.println(e>3 || e < 4);

        int r=5;
        System.out.println(!(r > 3 && r < 10)); /*// returns false because ! (not) is used to reverse the result*/

        int u=10;
        int i=5;
        int o=u+i;
        System.out.println(o);

        String a="50";
        String s="40";
        String d=a+s;
        System.out.println(d);



    }
}
