import java.util.Scanner;

public class GradeCalculationPractice {

    public static void main(String[] args) {
        GradeCalculationPractice Grades = new GradeCalculationPractice();
        Grades.GradeCalculator();
    }

    public String GradeCalculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name");
       String StudentName = scanner.nextLine();

        System.out.println("Enter Class");
        String Class = scanner.nextLine();

        System.out.println("Enter Section");
        String Section = scanner.nextLine();

        System.out.println("Enter Roll no");
        String Rollno = scanner.nextLine();

        System.out.println("Enter marks in English");
        double English = scanner.nextDouble();
        System.out.println("Enter marks in Maths");
        double Math = scanner.nextDouble();
        System.out.println("Enter marks in Social Studies");
        double SST = scanner.nextDouble();
        System.out.println("Enter marks in Hindi");
        double Hindi = scanner.nextDouble();
        System.out.println("Enter marks in science");
        double Science = scanner.nextDouble();
        int totalMarks = 500;
        double  obtainedMarks = (Hindi+English+SST+Math+Science);
       double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage: "+percentage+ "");
String remark="";
        if(percentage< 50){
            remark ="Student need to work hard";
        } else if (percentage>50 && percentage<65) {
            remark = "Need improvemnet";
        } else if (percentage>66 && percentage<85) {
            remark ="Good performance";
        }else {
            remark ="Meritorious student";
        }
//Report card
        System.out.println("\n==============SAROJ CONVENT SCHOOL, TIKAMGHAR=============\n");
        System.out.println("------------------------Report Card------------------------");
        System.out.println("---------------------Half yearly Exams---------------------");
        System.out.println("Name:     "+StudentName+"");
        System.out.println("Class:    "+Class+"");
        System.out.println("Section:  "+Section+"");
        System.out.println("Roll No.: "+Rollno+"");
        System.out.println("\n------------------------------------------------------------\n");
        System.out.printf("%-20s %-10s\n", "Subject", "Marks");
        System.out.println("---------------------------------------------");
        System.out.printf("%-20s %-10f\n", "English", English);
        System.out.printf("%-20s %-10.2f\n", "Maths", Math);
        System.out.printf("%-20s %-10.2f\n", "Social Studies", SST);
        System.out.printf("%-20s %-10.2f\n", "Hindi", Hindi);
        System.out.printf("%-20s %-10.2f\n", "Science", Science);
        System.out.println("---------------------------------------------");

        System.out.printf("%-20s %-10.2f\n", "Total Marks", obtainedMarks);
        System.out.printf("%-20s %-10.2f\n", "Percentage", percentage);
        System.out.println("---------------------------------------------");

        System.out.println("Remark: " + remark);
        System.out.println("=============================================");
        return remark;
    }
}
