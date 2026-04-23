import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Оң сан енгізіңіз:");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Сіз енгіздіңіз: " + number);
    }
}

