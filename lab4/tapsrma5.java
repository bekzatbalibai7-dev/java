public class tapsrma5 {
    public static void main(String[] args) {

        int i = 1;

        System.out.println("1-ден 100-ге дейінгі тақ сандар:");

        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
    }
}
