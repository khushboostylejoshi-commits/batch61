import java.util.Scanner;

public class PerfectNumberAssignment {
    public static void main(String[] args) {
        System.out.println("Enter the input number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


       int sum =0;
       for(int i=1; i<input/2; i++){
        if (i%input==0){
        sum =1+i;
}
       }
if(sum!=0 && sum== input){
    System.out.println("its a perfect number");


}else {
    System.out.println("its not a perfect number");
}

    }
}
