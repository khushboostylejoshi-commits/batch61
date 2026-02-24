import java.util.Scanner;

public class MintutesDaysYearsAssignment3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prove the no. of mins");
        //Using long as the memory space for long is 8bytes ,bigger than the memory space of int (4bytes)
        long mins = scanner.nextLong();

        //To convert min into days , one ay has 24 hrs and one hr has 60 min ,so dividing the mins by 60*24

        long days = mins/(24*60);
        System.out.println("No. od days are as follow "+days+"");

        // To convert min into days dividing the value with 24*60*365 ,as we already have th days conversion ,for years we only have to divide by 365

        long years = days/365;
        System.out.println("No. of years "+years+"");



    }


}


