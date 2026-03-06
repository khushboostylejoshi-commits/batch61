import java.util.Scanner;

public class TempratureConversionAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Celcius Input");
        double tempCelcius = scanner.nextDouble();
        double Kelvin = tempCelcius+273;
        System.out.println("Celcius Input: "+tempCelcius+" = kelvin Output "+Kelvin+" ");

        double ferenhite = ((1.8*tempCelcius)+32);
        System.out.println("Celcius Input: "+tempCelcius+" = kelvin Output "+ferenhite+" ");

    }
}
