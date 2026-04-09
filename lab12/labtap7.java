import java.util.Scanner;

    public class labtap7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equalsIgnoreCase(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }

