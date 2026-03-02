import javax.script.ScriptEngine;
import java.util.Scanner;

public class IfElseLoopAndSwitchCase {

    public static void main(String[] args) {

        /*whenever we have a range of multiple value to verfiy we can use if ,else statement with more
        number of data we can use nested if else lool */

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the first number");
//        int val1 = scanner.nextInt();
//        System.out.println("Enter the second number");
//        int val2 = scanner.nextInt();
//        System.out.println("Enter the third number");
//        int val3 = scanner.nextInt();
//
//        if (val1 > val2 && val1 > 3) {
//            System.out.println("" + val1 + " is the greatest of three");
//        } else if (val2 > val1 && val2 > val3) {
//            System.out.println("" + val2 + " is the greatest of three");
//        } else {
//            System.out.println("" + val3 + " is the gratest");
//        }

        //To take a number from user and on that basis print the corrspondind day in the output
        // Approach1

        System.out.println("Enter a number ");
        int value = scanner.nextInt();

        if (value == 1) {
            System.out.println("Monday");
        } else if (value == 2) {
            System.out.println("Tuesday");
        } else if (value == 3) {
            System.out.println("Wednesday");
        } else if (value == 4) {
            System.out.println("Thursday");
        } else if (value == 5) {
            System.out.println("Friday");
        } else if (value == 6) {
            System.out.println("Saturday");
        } else if (value == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input");
        }

//Approach2: switch case
        /*With the limitation in if else that even if in a if else statement we provide a
        duplicate condition it wont gives an error and execute the first block and leave the second block.
        We use Switch case here if we provide a duplicate condition it shows a warning*/
        System.out.println("Enter the switch case value");
        int newVal = scanner.nextInt();

        switch (newVal) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }






    }
}




