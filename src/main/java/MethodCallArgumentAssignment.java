
import java.util.Scanner;

public class MethodCallArgumentAssignment {
    public static void main(String[] args) {
        methods obj = new methods();

        int k = obj.sum(10,20,30);
        System.out.println("k is "+k+"");
        int l = obj.sum(50,60,70);
        System.out.println("l is "+l+"");
    }

}

class methods {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b= scanner.nextInt();
    int c = scanner.nextInt();
    public int sum(int a,int b, int c){
        int j = a+b-c;
        return j;
    }


}
