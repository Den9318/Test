public class Main {
    public static void main(String[] args) {

        int germansprechen = 58;
        int germanschreiben = 59;
        int germanlesen = 59;
        int result1 = 132;// как сделать чтоьы три параметра складывались и тотал показывало трех параметров?

        if (germansprechen >= 60) {
            System.out.println("Gut");

        } else if (germanschreiben >= 60) {
            System.out.println("Gut");

        } else if (germanlesen >= 60) {
            System.out.println("Gut");

        } else if (result1 >= 180 ) {
            System.out.println("Get certificate");
        } else {
                System.out.println("Noch einmal");
            }
        }
    }