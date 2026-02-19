import java.util.Scanner;

    public class fx {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("x мәнін енгізіңіз: ");
            double x = scanner.nextDouble();
            double result;

            if (x < 0) {
                result = x * x;
            } else if (x >= 0 && x < 5) {
                result = 2 * x + 1;
            } else {
                result = 10;
            }

            System.out.println("f(x) = " + result);

            scanner.close();
        }
    }


