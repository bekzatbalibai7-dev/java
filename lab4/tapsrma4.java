import java.util.Scanner;

public class tapsrma4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Символ енгізіңіз: ");
        char ch = scanner.next().charAt(0);

        System.out.print("Қанша рет шығару керек: ");
        int count = scanner.nextInt();

        int i = 0;

        while (i < count) {
            System.out.print(ch + " ");
            i++;
        }
    }
}
