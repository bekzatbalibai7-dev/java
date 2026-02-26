import java.util.Scanner;

    public class tapsrma7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("x мәнін енгізіңіз: ");
            double x = sc.nextDouble();
            double f;

            if (x > 0 && x < 1) {
                f = Math.sqrt(3 * Math.pow(x, 3) + 4 + Math.cos(x));
            } else {
                f = 5 - Math.pow(Math.sin(9 * x), 2);
            }

            System.out.println("f(x) = " + f);
        }
    }

