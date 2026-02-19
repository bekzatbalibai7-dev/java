 import java.util.Scanner;

     public class array {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.print("Массив өлшемін енгізіңіз: ");
             int n = scanner.nextInt();

             int[] arr = new int[n];
             int count = 0;

             System.out.println("Массив элементтерін енгізіңіз:");
             for (int i = 0; i < n; i++) {
                 arr[i] = scanner.nextInt();
             }

             for (int i = 0; i < n; i++) {
                 if (arr[i] % 2 == 0) {
                     count++;
                 }
             }

             System.out.println("Жұп элементтер саны: " + count);

             scanner.close();
         }
     }
