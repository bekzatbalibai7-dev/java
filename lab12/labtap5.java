import java.util.Scanner;

    public class labtap5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            System.out.println("Enter a word to search:");
            String word = scanner.nextLine();

            if (sentence.contains(word)) {
                System.out.println("The word \"" + word + "\" is found in the sentence.");
            } else {
                System.out.println("The word \"" + word + "\" is not found in the sentence.");
            }
        }
    }

