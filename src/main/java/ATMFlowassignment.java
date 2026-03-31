import java.util.Scanner;

public class ATMFlowassignment {
    public static void main(String[] args) {
        AmstrongNumberAssignment obj = new AmstrongNumberAssignment();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Debit card");
        //Your name
        long debitCardNo = scanner.nextLong();
        if(debitCardNo<99999999){
            System.out.println("-----------------Services--------------");
            System.out.println("-------------- 1:Withdrawl-------------------");
            System.out.println("---------------2:Account Balance-------------");
            System.out.println("---------------3:Cancel----------------------");
            ATMFlowassignment userInput = new ATMFlowassignment();
            int userSelection = userInput.ATMinput();
            if (userSelection == 1) {
                userInput.withdrawl();
            } else if (userSelection == 2) {
               double userBalance = userInput.accountBalance();
                System.out.println(""+userBalance+"");
            } else {
                System.out.println("Cancel the operation");
            }
            System.out.println("Thank you");

        }else {
            System.out.println("Icorrect Debit Card Number");
        }


    }

    public int ATMinput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Withdraw Amount");

        } else if (input == 2) {
            System.out.println("Account Balance");
        } else if (input == 3) {
            System.out.println("Cancel");
        } else {
            System.out.println("Invalid Input");
            System.out.println("-----Please take out the card and Re-insert-----");
        }
return input;
    }

    public void withdrawl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your four digit pin");
        int pin = scanner.nextInt();
        long withdrawlAmount =0;
        if (pin < 9999) {
            System.out.println("Wait while we collect your data");
            System.out.println("Please Enter the amount");
            withdrawlAmount = scanner.nextLong();
            if (withdrawlAmount < 10000) {
                System.out.println("Wait while we generate your withdrawl");
                System.out.println("Please collect you amount below ");
                System.out.println("=======You have withdrawl " + withdrawlAmount + "========");
                System.out.println("Thank you");
            } else {
                System.out.println("We can only proceed with amount less than 10,000");
                System.out.println("Please enter correct amount");
            }
        } else {
            System.out.println("Invalid pin");
        }

    }

    public double accountBalance() {
        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();
        if (pin < 9999) {
            System.out.println("Wait while we collect your data");
            double accountBalance = scanner.nextDouble();
            System.out.println("You have " + accountBalance + " in your account");
            System.out.println("-----------Thank you---------------");
        } else {
            System.out.println("You have entered Invalid Pincode");
        }
        return accountBalance();
    }
}







