import java.util.Scanner;

public class lab3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Катеттерді енгізу
            System.out.print("a катетін енгізіңіз: ");
            double a = sc.nextDouble();

            System.out.print("b катетін енгізіңіз: ");
            double b = sc.nextDouble();

            // Гипотенузаны есептеу
            double c = Math.sqrt(a * a + b * b);

            // Үшбұрыштың ауданын есептеу
            double area = (a * b) / 2;

            // Нәтижелерді шығару
            System.out.println("Гипотенуза = " + c);
            System.out.println("Үшбұрыштың ауданы = " + area);
        }
    }
