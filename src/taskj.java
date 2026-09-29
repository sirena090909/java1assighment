import java.util.Scanner;

public class taskj {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int next = n + 2 - n % 2;
        System.out.println(next);

    }
}
