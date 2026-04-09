import java.util.Scanner;

    public class labtap8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first string:");
            String string1 = scanner.nextLine();

            System.out.println("Enter the second string:");
            String string2 = scanner.nextLine();

            if (string1.equals(string2)) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
        }
    }
