import java.util.Scanner;

public class FibinnaciSeriesAssignment {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int a= 0;
        int b= 1;
        System.out.println("Fibonnaci Series: ");
        for(int k=1; k<=num; k++){
            System.out.println(a + "");
            int sum = a+b;
            a=b;
            b= sum;


        }

    }
}
