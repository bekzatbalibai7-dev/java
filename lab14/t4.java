import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "12345";
        String input;

        do {
            System.out.println("Құпиясөзді енгізіңіз:");
            input = scanner.nextLine();
        } while (!input.equals(correctPassword));

        System.out.println("Қол жеткізілді!");
    }
}
