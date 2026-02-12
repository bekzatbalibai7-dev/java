import java.util.Scanner;

public class tapsrma13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Координаталарды енгізу
            System.out.print("x1 мәнін енгізіңіз: ");
            double x1 = sc.nextDouble();

            System.out.print("y1 мәнін енгізіңіз: ");
            double y1 = sc.nextDouble();

            System.out.print("x2 мәнін енгізіңіз: ");
            double x2 = sc.nextDouble();

            System.out.print("y2 мәнін енгізіңіз: ");
            double y2 = sc.nextDouble();

            // Арақашықтықты есептеу
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // Нәтижені шығару
            System.out.println("Екі нүктенің арақашықтығы: " + distance);
        }
    }

