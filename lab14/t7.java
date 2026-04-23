import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Бірінші сан:");
            int a = scanner.nextInt();

            System.out.println("Екінші сан:");
            int b = scanner.nextInt();

            System.out.println("Қосынды: " + (a + b));

            scanner.nextLine(); // буферді тазалау

            System.out.println("Жалғастыру? (yes/no):");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Бағдарлама аяқталды.");
    }
}
