import java.util.Scanner;

public class BankAccountProramAssignment10 {
    public static void main(String[] args) {
        IntrestCalculation IntrestVal = new IntrestCalculation();
        int newIntrest = IntrestVal.intrest();
        int newamount = IntrestVal.amount;
        int tax = (IntrestVal.intrest()/10);
        System.out.println("tax is "+tax+"");

        int userVal = newamount-(newIntrest+tax);
        System.out.println("User gets "+userVal+"");

    }
}


    class IntrestCalculation {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int years = scanner.nextInt();
        public int intrest() {
            int intrestCal = 0;
            if (amount <= 50000) {
                intrestCal = (amount * years * 10) / 100;
                System.out.println("Intrest rate is " + intrestCal + "");
            } else if (amount > 500001 && amount < 100000) {
                intrestCal = (amount * years * 12) / 100;
                System.out.println("The intrest rate is " + intrestCal + "");
            } else if (amount > 100000) {
                intrestCal = (amount * years * 15) / 100;
                System.out.println("The intrest rate is " + intrestCal + "");
            } else {
                System.out.println("invalid value");
            }
            return intrestCal;
        }
    }



