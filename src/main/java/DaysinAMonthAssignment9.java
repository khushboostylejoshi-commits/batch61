import java.util.Scanner;

public class DaysinAMonthAssignment9 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number input");
        int number = scanner.nextInt();

        int monthDays = 0;
        if (number == 1) {
            System.out.println("January");
            monthDays = 31;
        } else if (number == 2) {
            System.out.println("Feburary");
            monthDays = 28;
        } else if (number == 3) {
            System.out.println("March");
            monthDays = 31;
        } else if (number == 4) {
            System.out.println("April");
            monthDays = 30;
        } else if (number == 5) {
            System.out.println("May");
            monthDays = 31;
        } else if (number == 6) {
            System.out.println("June");
            monthDays = 30;
        } else if (number == 7) {
            System.out.println("July");
            monthDays = 31;
        } else if (number == 8) {
            System.out.println("August");
            monthDays = 31;
        } else if (number == 9) {
            System.out.println("Spetember");
            monthDays = 30;
        } else if (number == 10) {
            System.out.println("October");
            monthDays = 31;
        } else if (number == 11) {
            System.out.println("November");
            monthDays = 30;
        } else if (number == 12) {
            System.out.println("December");
            monthDays = 31;
        } else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(""+monthDays+"");


        //Approach 2:Switch case
        System.out.println("enter the number2");
        int number2 = scanner.nextInt();
        int daysInmonth = 0;

        switch (number2) {
            case 1:
                System.out.println("January");
                daysInmonth = 31;
                break;
            case 2:
                System.out.println("Feb");
                daysInmonth = 28;
                break;
            case 3:
                System.out.println("March");
                daysInmonth = 31;
                break;
            case 4:
                System.out.println("April");
                daysInmonth = 30;
                break;
            case 5:
                System.out.println("May");
                daysInmonth = 31;
                break;
            case 6:
                System.out.println("June");
                daysInmonth = 30;
                break;
            case 7:
                System.out.println("July");
                daysInmonth = 31;
                break;
            case 8:
                System.out.println("August");
                daysInmonth = 30;
                break;
            case 9:
                System.out.println("September");
                daysInmonth = 31;
                break;
            case 10:
                System.out.println("oct");
                daysInmonth = 30;
                break;
            case 11:
                System.out.println("nov");
                daysInmonth = 30;
                break;
            case 12:
                System.out.println("Dec");
                daysInmonth = 31;
                break;
            default:
                System.out.println("invalid input");
                return;

        }
        System.out.println(""+daysInmonth+"");

        }

    }



