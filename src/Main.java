import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         System.out.println(getOperation());
                System.out.println(getChar('!', '#', '^'));

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
                System.out.println("Число в кубе равно: ");

                return (int) Math.pow(value, pwvalue);
            }

    public static int getOperation() {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите 2 число:");
        int num2 = scanner.nextInt();
        System.out.println("Введите действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action) {
            case "+":
                int res1 = num1 + num2;
                System.out.println("Результат сложения " + res1);
                break;
            case "-":
                int res2 = num1 - num2;
                System.out.println("Результат вычетания " + res2);
                break;
            case "*":
                int res3 = num1 * num2;
                System.out.println("Результат умножения " + res3);
                break;
            case "/":
                int res4 = num1 / num2;
                System.out.println("Результат деления " + res4);
                break;

        }

        return 0;
    }

    public static int[] getChar(char c, char c1, char c2) {

    char [] numberTochar = new char[10];
//        int num = Integer.parseInt(String.valueOf(numberTochar))

    int[] intArray = new int [numberTochar.length];
    for (int i = 0; i < numberTochar.length; i++) {
        intArray[i] = Character.getNumericValue(numberTochar[i]);
    }

    return intArray;
  }
}


