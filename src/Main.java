import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int germansprechen = 58;
        int germanschreiben = 59;
        int germanlesen = 59;
        int result = 132;// как сделать чтобы три параметра складывались и тотал показывало трех параметров?

        if (germansprechen >= 60) {
            System.out.println("Gut");

        } else if (germanschreiben >= 60) {
            System.out.println("Gut");

        } else if (germanlesen >= 60) {
            System.out.println("Gut");

        } else if (result >= 180 ) {
            System.out.println("Get certificate");
        } else {
                System.out.println("Noch einmal");
            }
        System.out.println();

        int a = 1000;
        boolean b = true;
        long c = 1000L;
        boolean d = false;

        if (a < c) {

            System.out.println(b);

        } else if (c < a) {

            System.out.println(d);
        }
        else {
            System.out.println("Number incorrect");
        }
    }

}


