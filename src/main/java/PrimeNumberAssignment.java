import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.Scanner;

public class PrimeNumberAssignment {

    public boolean isPrimeNmbr(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
      int num = scanner.nextInt();
//
//        PrimeNumberAssignment obj = new PrimeNumberAssignment();
//
//        if (obj.isPrimeNmbr(num)) {
//            System.out.println(num + " is a Prime Number");
//        } else {
//            System.out.println(num + " is NOT a Prime Number");
//        }
//
//        scanner.close();



        boolean isPrimeNumber = true;

        if(num<=1){
            isPrimeNumber=false;

        }else{
            for(int k =2; k<num/2;k++){
                if (num%k ==0){
                    isPrimeNumber= false;
                    break;
                }


            }
        }

        if (isPrimeNumber){
            System.out.println(""+num+"" + "is Prime Number");

        }else {
            System.out.println(""+num+"" + "is Not prime number");
        }
    }
}