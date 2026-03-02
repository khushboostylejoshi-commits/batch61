public class VoidMethodAssignment {

    public static void main(String[] args) {

        VoidMethodAssignment obj = new VoidMethodAssignment();
        obj.method1();
        VoidMethodAssignment.method2();
    }

    public void method1(){
        System.out.println("This is a void non static method");
    }
    static public void method2() {
        System.out.println("This is a static void method");
    }
}
