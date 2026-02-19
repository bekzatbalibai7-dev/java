import java.util.Scanner;

    public class  DoWhileloop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nМәзір:");
                System.out.println("1 – Хабарлама шығару");
                System.out.println("2 – Екі санды қосу");
                System.out.println("3 – Шығу");
                System.out.print("Таңдауыңызды енгізіңіз: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Сәлеметсіз бе!");
                        break;

                    case 2:
                        System.out.print("Бірінші санды енгізіңіз: ");
                        int a = scanner.nextInt();
                        System.out.print("Екінші санды енгізіңіз: ");
                        int b = scanner.nextInt();
                        System.out.println("Қосынды: " + (a + b));
                        break;

                    case 3:
                        System.out.println("Бағдарлама аяқталды.");
                        break;

                    default:
                        System.out.println("Қате таңдау! Қайтадан көріңіз.");
                }

            } while (choice != 3);

            scanner.close();
        }
    }


