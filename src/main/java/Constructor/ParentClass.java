package Constructor;

public class ParentClass {
public ParentClass(){
    System.out.println("Its a call from parent class constructor");
}

public ParentClass(int i){
    System.out.println("This is one param constructor in parent class");
    System.out.println("To call this constructor we need to use super keyword");
    System.out.println("As we have one param we use super(datatype value)");
    System.out.println(i);
}

    public ParentClass(int i, int j){
        System.out.println("This is two param constructor in parent class");
        System.out.println("To call this constructor we need to use super keyword");
        System.out.println("As we have one param we use super(datatype value,datatype value)");
        System.out.println(i+j);
    }
}
