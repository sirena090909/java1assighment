import java.util.Scanner;

public class taskg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int a = (number / 10) % 10;
        System.out.println(a);



    }
}