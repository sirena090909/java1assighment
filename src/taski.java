import java.util.Scanner;

public class taski {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sum = number / 100 + (number / 10) % 10 +number % 10;
        System.out.println(sum);

    }
}
