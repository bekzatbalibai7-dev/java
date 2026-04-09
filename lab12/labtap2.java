import java.util.Scanner;

    public class labtap2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            System.out.println("Uppercase: " + input.toUpperCase());
            System.out.println("Lowercase: " + input.toLowerCase());
        }
    }

