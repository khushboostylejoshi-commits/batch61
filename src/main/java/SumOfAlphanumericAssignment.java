
import java.util.Scanner;

public class SumOfAlphanumericAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphaNumericVal = "Tech12elliptoca21";
        //To get the sum of any integer value we are initializing a integer sum
        int sum = 0;
        //To read all the characters one by one from the string we are using String num. from here we will collect the numbers in the string and store them
        String num = "";

        //here we are initializing a for loop where for every i value less thean the string lenght ,it will move to next value in the string
        for (int i = 0; i < alphaNumericVal.length(); i++) {
            //The below will store each char in the "readThe string" variable
            char readThestring = alphaNumericVal.charAt(i);
            if (Character.isDigit(readThestring)) {
                //  To build the number after collecting them from the String we are adding the emply string to the Numeric value present in the string
                num = num + readThestring;
            } else {
                if (!num.isEmpty()) {
                    //Now as we have read the characters from the Provide alphanumeric string in the baove step and stored thema in a string varaible num, we
                    //we are checking if the num is not empty(which means it has collected some numeric value we can add this value in sum string
                    //But as sum string is integer and num is string we are converting it to int by using Integer.parseInt(num) and storing printint the sum value
                    sum = sum + Integer.parseInt(num);
                    num ="";
                }
            }


        }
        if (!num.isEmpty()) {
            sum = sum + Integer.parseInt(num);
            System.out.println(sum);

        }

    }
}
