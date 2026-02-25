import java.util.Scanner;

public class IfElseLoopAssignment6 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int val1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int val2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int val3 = scanner.nextInt();

        if (val1>val2 && val1>3) {
            System.out.println("" + val1 + " is the greatest of three");
        }else if (val2>val1 && val2>val3){
            System.out.println(""+val2+" is the greatest of three");
        }else{
            System.out.println(""+val3+" is the gratest");
        }
    }
    }

