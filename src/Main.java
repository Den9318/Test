import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(getTelnumber("+380997668527"));
//        System.out.println(getPow(3));
//         System.out.println(getOperation());
//         char [] array = {'@','#', '%', '^'};
//                System.out.println(Arrays.toString(getChar(array)));

//        char [] array = new char [6];
//        str.getChars(0, 6, array,0);
//        System.out.println(Arrays.toString(array));

//    }
//
//            public static byte getNumber(byte a) {
//                return a;
//            }
//
//            public static double getNumber(double a, double b) {
//                return a + b;
//            }
//
//            public static long getNumber(long c) {
//                return c;
//            }
//
//            public static int getNumber(int a, int b, int c) {
//                return a + b + c;
//            }
//
//            public static int getNumber(int a, int b, int c, int d) {
//                return a + b + c / d;
//            }
//
//            public static int getNumber(int a, int b, int c, int d, int e) {
//                return (a + b + c) / d * e;
//            }
//
//            ////// куб числа
//            public static int getPow(int value) {
//                System.out.println("Число в кубе равно: ");
//
//                return (int) Math.pow(value, 3);
//            }
//
//    public static int getOperation() {
//    Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите 1 число:");
//        int num1 = scanner.nextInt();
//        System.out.println("Введите 2 число:");
//        int num2 = scanner.nextInt();
//        System.out.println("Введите действие: ");
//        String action = scanner.nextLine();
//        action = scanner.nextLine();
//        switch (action) {
//            case "+":
//                int res1 = num1 + num2;
//                System.out.println("Результат сложения " + res1);
//                break;
//            case "-":
//                int res2 = num1 - num2;
//                System.out.println("Результат вычетания " + res2);
//                break;
//            case "*":
//                int res3 = num1 * num2;
//                System.out.println("Результат умножения " + res3);
//                break;
//            case "/":
//                int res4 = num1 / num2;
//                System.out.println("Результат деления " + res4);
//                break;
//
//        }
//
//        return 0;
//    }
//
//    public static int[] getChar(char [] numberChar  ){
//
//    int [] numberTochar = new int[numberChar.length];
//
//    for (int i = 0; i < numberTochar.length; i++) {
//        numberTochar[i] = numberChar[i];
//    }
//
//    return numberTochar;
//  }
//
//}
//        System.out.println();
//        ///1
//        String str = "Hello";
//        String str1 = " World";
//
//        System.out.println(str + str1);
//        System.out.println(str.concat(str1));
//        System.out.println(String.format(str + str1));
//
//        ///2
//        System.out.println();
//
//        String con = "Concatenation";
//
//        System.out.println(con.substring(5, 7));
//
//        ///3
//
//        System.out.println();
//
//        String name = "Denys";
//        String secondanme = "Orlov";
//        String faculty = "Physic";
//
//
//        String sf1 = String.format("Name is: %s", name);
//        String sf2 = String.format("Second name is: %s", secondanme);
//        String sf3 = String.format("value is: %s", faculty);
//
//        System.out.println(sf1);
//        System.out.println(sf2);
//        System.out.println(sf3);
//
//        System.out.println();

//        int[] array = {1, 2, 30, 112, 117};
//        int max = array [0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];


        ///////////4
    }

    public static String getTelnumber(String number) {

        String example = ("^\\+[\\(\\-]?(\\d[\\(\\)\\-]?){11}\\d$");
        String correctnumber = "+380997668527";
        correctnumber = number;


        if (correctnumber == example) {

            Pattern patern = Pattern.compile("(\"^\\\\+[\\\\(\\\\-]?(\\\\d[\\\\(\\\\)\\\\-]?){11}\\\\d$\")");
            Matcher matcher = patern.matcher(number);
            System.out.println(matcher.find());
            System.out.println("Correct");

        } else if (number.length() == 13) {
            System.out.println("Accept");

        } else {
            System.out.println("Wrong");

        }
        return correctnumber;
    }
}

//            System.out.println(max);
//    }