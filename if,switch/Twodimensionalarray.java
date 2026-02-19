import java.util.Scanner;

    public class Twodimensionalarray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Жол санын енгізіңіз: ");
            int rows = scanner.nextInt();

            System.out.print("Баған санын енгізіңіз: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];
            int sum = 0;

            System.out.println("Матрица элементтерін енгізіңіз:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                    sum += matrix[i][j];  // бірден қосып отырамыз
                }
            }

            System.out.println("Барлық элементтердің қосындысы: " + sum);

            scanner.close();
        }
    }