import java.util.Scanner;

public class taskl {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        n = n % 86400;
        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;
        String result = String.format("%d:%102d:%02d", hours, minutes, seconds);

                System.out.println(result);

    }
}
