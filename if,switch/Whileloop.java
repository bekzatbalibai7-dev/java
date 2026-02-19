import java.util.Scanner;

    public class  Whileloop  {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("n санын енгізіңіз: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Факториал теріс сан үшін анықталмаған!");
            } else {
                long fact = 1;   // үлкен сандар үшін long қолданамыз
                int i = 1;

                while (i <= n) {
                    fact *= i;
                    i++;
                }

                System.out.println("Факториал: " + fact);
            }

            sc.close();
        }
    }

