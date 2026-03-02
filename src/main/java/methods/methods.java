package methods;

import static java.awt.AWTEventMulticaster.add;

public class methods {

    public static void main(String[] args) {

        methods callmethods = new methods();
        callmethods.method1();
        callmethods.method2();
        //As the mehod 2 has a return type as int to get the output we have to declare a int here
        int method2val = callmethods.method2();
        System.out.println(method2val);

        callmethods.method3("thirtyone",20);
        int methid3val = callmethods.method3("thirtyone",20);
        System.out.println(methid3val);


        //A method is a service on the basis of requirement
        // A method has three important requirement 1)input 2)method 3)Return as output
        //There are three types of method 1)NoInputNoOutput 2)NoInputOutput 3)InputOutput
        //The methods are always craeted after or before the main method
        //Without calling the methods into the main method the methods will not be run
        // tO call the methods into the main method we need to craete a Object and then using the object we can call the method and run them inside the main methos
// To create a method we need to use public keyword ,data type (return type), name of method ,();


    }//Main method ends here
    //creating methods here
    //Noinpout NoOutput method

    public void method1(){
        System.out.println("hello its a no input no output method");
        System.out.println("We need a object to call them");
    }

    //No input Output method
    public int method2(){
        System.out.println("Its a no input output method");
        int c = 10;
        int b = 20;
        int a = b + c;
return a;
    }

    //input output method
    public int method3(String val, int x){
        System.out.println("its a input and output method");
        String name = "khushboo";
        for (int i =0; i<4; i++ ) {
            System.out.println("" + name + " and age " + val + "");
        }
        int y = x*x;
        return y;
    }




}
