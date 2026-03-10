import java.util.Scanner;

public class AmstrongNumberAssignment {
    public static void main(String[] args) {
AmstrongNumberAssignment obj = new AmstrongNumberAssignment();
obj.isArmstrong(153);
    }

    public boolean isArmstrong(int number) {
//        Scanner scanner = new Scanner(System.in);
//        number = scanner.nextInt();
        int numStore = number;
        int sum =0;
        //A armstrong number is where a number multiplied 3 times and added gives the same as the original no
   //To get first number
        while(number!=0) {
            int LastNum = number % 10;
            sum = sum + LastNum * LastNum * LastNum;
            // to remove last number
            number = number / 10;
        }

        if(sum == numStore) {
            System.out.println("Its a armstrong number");
            return true;

        }else {
            System.out.println("Its a not armstrong number");
            return false;
        }


    }
}
