import java.util.Scanner;

public class FcatorOfNumberAssignment {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Factor of the "+num +" are");
        for(int i =1; i<=num/2 ;i++){
            if (num%i==0){
                System.out.println(i +"");
            }



        }
    }
}
