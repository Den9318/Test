import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int germansprechen = 58;
//        int germanschreiben = 59;
//        int germanlesen = 59;
//        int result = 132;// как сделать чтобы три параметра складывались и тотал показывало трех параметров?
//
//        if (germansprechen >= 60) {
//            System.out.println("Gut");
//
//        } else if (germanschreiben >= 60) {
//            System.out.println("Gut");
//
//        } else if (germanlesen >= 60) {
//            System.out.println("Gut");
//
//        } else if (result >= 180) {
//            System.out.println("Get certificate");
//        } else {
//            System.out.println("Noch einmal");
//        }
//        System.out.println();
//
//        int a = 1000;
//        boolean b = true;
//        long c = 1000L;
//        boolean d = false;
//
//        if (a < c) {
//
//            System.out.println(b);
//
//        } else if (c < a) {
//
//            System.out.println(d);
//        } else {
//            System.out.println("Number incorrect");
//        }
//
//
//        System.out.println("Size of array: ");
//        Scanner s = new Scanner(System.in);
//
//        int size = s.nextInt();
//        int[] array = new int[size];
//
//        System.out.println("Enter number: ");
//
//        for (int i = 0; i < size; i++) {
//            array[i] = s.nextInt();
//        }
//        System.out.println(array.length);
//
//        System.out.println();
//        int[] array1 = {1, 2, 3, 4, 5, 6};
//
//        for (int i = 9; i > 0; i--) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + "= " + i * j);
//            }
//            System.out.println();
//        }
//        int [][] num = {{1, 4, 5, 7}, {8, 10, 11, 22}};
//        for (int y = 0; y < num.length; y++) {
//            for (int g = 0; g < num[y].length; g++) {
//                System.out.println(num[y][g]);

        System.out.println(getNumber(777, 44, 55, 100, 444));
        System.out.println(getPow(3, 3));
    }

    public static byte getNumber(byte a) {
        return a;
    }

    public static double getNumber(double a, double b) {
        return a + b;
    }

    public static long getNumber(long c) {
        return c;
    }

    public static int getNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static int getNumber(int a, int b, int c, int d) {
        return a + b + c / d;
    }

    public static int getNumber(int a, int b, int c, int d, int e) {
        return (a + b + c) / d * e;
    }

    ////// куб числа
    public static int getPow(int value, int pwvalue) {
        System.out.println("Число в кубе равно " + Math.pow(value, pwvalue));

       return value *pwvalue ;
  }
}







