public class StaticAndNonStaticMethods {

    String instancevariable ="Test1";
    static String staticVariable = "Test2";
    public static void main(String[] args) {
        //Ways to call static method
method2();
StaticAndNonStaticMethods.method2();
//way to call instance or non-static method
        StaticAndNonStaticMethods obj = new StaticAndNonStaticMethods();
        obj.method1();
        //ways to call static variable
        System.out.println(staticVariable);
        System.out.println(StaticAndNonStaticMethods.staticVariable);

        //ways to callnon static/instance variable
        System.out.println(obj.instancevariable);
    }

    public void method1(){
        System.out.println("This is a non-static method as noStatic keyword is used before the method name");
        System.out.println("For non-static method we need to craete an object to call the method or variable");

    }

    public static void method2(){
        System.out.println("This is a static method");
        System.out.println("we can call the static method in main method which is also static by using two ways");
        System.out.println("1. directly");
        System.out.println("2.By using classname.Methodname");

    }
}
