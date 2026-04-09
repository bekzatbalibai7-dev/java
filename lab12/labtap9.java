import java.util.Scanner;

    public class labtap9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            System.out.println("Enter a delimiter:");
            String delimiter = scanner.nextLine();

            String[] parts = sentence.split(delimiter);

            System.out.println("Split parts:");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
