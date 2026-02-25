import java.util.Scanner;

public class PositiveNegativeIfElseAssignment8 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value");
        int value = scanner.nextInt();

        if (value > 0){
            System.out.println("Value is positive");
        }else {
            System.out.println("Value is negative");
        }
    }
}
