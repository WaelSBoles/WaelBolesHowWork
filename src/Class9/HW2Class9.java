package Class9;

public class HW2Class9 {
    public static void main(String[] args) {
          /*Create an array of names and store all names of your group. Then print your name from that array.
          (use 2 different ways of creating an array).
           */
        String [] names={"Wael","Mariam","Tota","Lolo"};
        System.out.println(names[0]);

        System.out.println("+++++++++++++++++++++");

        String []  name=new String[4];
         name[0]="Lolo";
         name[1]="Mariaml";
         name[2]="Tota";
         name[3]="Wael";
        System.out.println(name[3]);
    }
}
