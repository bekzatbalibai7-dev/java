import java.util.Scanner;

    public class labtap4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            String[] words = sentence.split(" ");
            for (String word : words) {
                String reversedWord = new StringBuilder(word).reverse().toString();
                System.out.print(reversedWord + " ");
            }
        }
    }

