import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Операция орындалуда...");
            System.out.println("Жалғастырасыз ба? (yes/no):");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Бағдарлама аяқталды.");
    }
}
