import java.util.Scanner;

public class taskk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        n = n % 1440;
        int hours = n / 60;
        int minutes = n % 60;
        System.out.println( hours + " " + minutes);

    }
}
