package Class9;

public class E6Arrays {
    public static void main(String[] args) {
        boolean[] flags={true,false,true,false,false,true,false};
        int counter=0;
        for (int i = 0; i <flags.length ; i++) {
            if(!flags[i]){
                System.out.println(flags[i]);
                counter++;
            }

        }
        System.out.println(counter);
    }
}
