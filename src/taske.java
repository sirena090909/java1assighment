import java.util.Scanner;
public class taske {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int t = in.nextInt();
        int position = (v * t % 109 + 109) % 109;
        System.out.println(position);
    }
}
