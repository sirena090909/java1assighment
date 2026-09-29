import java.util.Scanner;
public class taskf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int last = number % 10;
        System.out.println(last);
    }
}

