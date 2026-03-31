import java.util.Scanner;

public class PrimeNumberAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;

        for(int i = 2; i<=num/2 ; i++){
            if(num%i==0){
                isPrime =false;
                break;
            }
            }
if (isPrime){
    System.out.println("Its a prime number");

        }else{
    System.out.println("Its not a prime number");
        }
    }
}
