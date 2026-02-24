import java.util.Scanner;

public class OperatorsProgramAssignment2 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer");
        int i = scanner.nextInt();

        System.out.println("Enter second Integer");
        int j = scanner.nextInt();

        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);

        if(i>j) {
            System.out.println("" + i + " bigger no. and "+j+" is smaller ");
        }  else{
            System.out.println(""+j+" is biggger and "+i+" is smaller");
        }


    }
}
