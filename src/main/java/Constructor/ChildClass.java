package Constructor;

public class ChildClass extends ParentClass{
    String name = "Tom";
    String age = "Twenty";
    int time =10;
    //A constructor is a entity created during object creation and consist the template of a class
    //A constructor name should be also same as the class name
    //unlike a method, A constructor does not have a return type
    //A constructor does not have static or non-static keyword
    // It does not have return type so no void is also used
    // we can also declare a constructor
    // if we dont declare a constructor and default constructor is always created by java, if we dont provide any action to that default costructor ,the output will be blank

    //We can also perform constructor overloading
    //By creating different constructors having same name and different parameters types similar to methods
   public ChildClass(){
       //super(20,30);//this will call the parent class two param constructor
       super(10);//this will call the parent class one param constructor

   }
    public ChildClass(String name){
        System.out.println("One param constructor");
        System.out.println(name);
        this.name =name;
    }

    public ChildClass(String name, int age){
        System.out.println("Two param constructor");
        System.out.println(name + age);
    }

    public ChildClass(String name,int age, int time){
       super(10,20);
    }



    public static void main(String[] args) {
ChildClass obj = new ChildClass();
//HERE, as soon as we create a object the constructors are called,though we have not created any constructor in ChildClass bu tthe parent class has a
        //constructor and that will be called when this program is ran
ChildClass obj1 =new ChildClass("khushboo");
ChildClass obj2 =new ChildClass(obj.name,31);
//to call two constructors with parameters we created two object with different name and params
//everytime we create the object the constructors will be craeteda nd will first read the constructor from the parent class

//SUPER KEYWORD
//To call the constructors with a parameter from the child class to parent class we use super keyword
        // The super keyword is always used on the top of the constructor ,it could not be used on the second line
        // so to call all the constructor from parent class(one param and two param) we have to create two constructors



    }
}
