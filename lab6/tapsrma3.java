import java.util.Scanner;

    public class tapsrma3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("x мәнін енгізіңіз: ");
            double x = scanner.nextDouble();
            double f;

            if (x > -4 && x <= 5) {
                f = Math.cbrt(Math.pow(x, 2)) + 3 + 6 * Math.pow(x, 2);
            } else if (x > 5) {
                f = Math.pow(x, 5) + 3.5;
            } else {
                System.out.println("Берілген аралыққа кірмейді!");
                return;
            }

            System.out.println("f(x) = " + f);
        }
    }

