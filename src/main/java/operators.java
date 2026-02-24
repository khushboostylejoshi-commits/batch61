public class operators {
    public static void main (String[]args){

        int  i = 10;
        int  j = 20;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println(i%j);
        //%always give the value after the decimal ,and /always give the values before the decimal to make it a integer
        //to get the sum of two numbers in avalue
        int firstno = (i/10);
        int lastno  = (i%10);
        System.out.println(firstno+lastno);
        //this will give the sum of a number
    }
}
