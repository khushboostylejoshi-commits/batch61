import java.util.Scanner;

public class SquareCubeFourthPowerAssignment4 {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("enter the value");
        int value = scanner.nextInt();

        //Square of a value
        System.out.println("square of the value is : "+value*value+"");
        //Cube of the value
        System.out.println("cube of the value is : "+value*value*value+"");
        //Fourth power of the value
        System.out.println("fourth power of the value is: "+value*value*value*value+"");


        /*Another Approach*/

        int square = value*value;
        int cube = square*value;
        int fourthPower = cube*value;
        System.out.println("The square,cube and fourth power is as follow : "+square+" "+cube+" "+fourthPower+"");

    }
}
