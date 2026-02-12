import java.util.Scanner;

public class tapsrma16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Қабырғаны енгізу
        System.out.print("Үшбұрыш қабырғасын енгізіңіз: ");
        double a = sc.nextDouble();

        // Ауданды есептеу
        double area = (a * a * Math.sqrt(3)) / 4;

        // Нәтижені шығару
        System.out.println("Тең қабырғалы үшбұрыштың ауданы = " + area);
    }
}
