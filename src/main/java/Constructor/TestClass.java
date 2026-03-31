package Constructor;

public class TestClass {
    public static void main(String[] args) {
        Human h1  = new Human();
        System.out.println(h1.name +  " - "+ h1.age);
    }
}

class Human{

    String name;
    int age;

    Human(){
        this("vaibhav");

    }
    Human(String name){
        this(name, 20);
    }

    Human(String name, int age){
        this.name = name ;
        this.age = age;
    }




}


