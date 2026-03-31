
import java.util.Scanner;

public class SumOfDigitsAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNo = scanner.nextInt();
        for(int i = 0; i<inputNo; i++){
            int lastDigit = inputNo/10;
            int firstDigit = inputNo%10;
            int sum = 0+lastDigit;
            System.out.println(sum);
        }
        ;
    }
}
