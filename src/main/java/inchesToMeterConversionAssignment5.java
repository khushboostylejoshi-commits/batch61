import java.util.Scanner;

public class inchesToMeterConversionAssignment5 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value in inches");
        double val = scanner.nextDouble();

        //To convert inches to meter * the value by 0.0254

        double meter = val*0.0254;
        System.out.println("the meter conversion is :"+meter+"");


    }
}
