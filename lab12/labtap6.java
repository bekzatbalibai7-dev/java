import java.util.Scanner;

    public class labtap6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            System.out.println("Enter the word to replace:");
            String oldWord = scanner.nextLine();

            System.out.println("Enter the new word:");
            String newWord = scanner.nextLine();

            String updatedSentence = sentence.replace(oldWord, newWord);
            System.out.println("Updated sentence: " + updatedSentence);
        }
    }

