import java.util.Scanner;

public class ReverseNumberAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; ++i) {

            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num/10;
        }
    }
}
