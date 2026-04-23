import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сан енгізіңіз:");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("Факториал: " + factorial);
    }
}
