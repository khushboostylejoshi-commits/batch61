public class SingletonDesignPattern {
    private static SingletonDesignPattern refereve_Variable=null;
    private SingletonDesignPattern(){
        String string = "My name is khushboo joshi";

    }


    public static SingletonDesignPattern method(){
        if(refereve_Variable==null)
            refereve_Variable = new SingletonDesignPattern();
        return refereve_Variable;
//here this if condition inside the method will check if the reference variable we created is null , if it is null
        //it will create the object here for object creation we are using 'variable = new classname();
        //and then return the value of the varibale
        //in the next run it would check that the variable is not null and hence will not create a new object
        //Thats how we are keeping the object creation limited to once.

    }
    //A singleton design pattern class is a class where only one object is created for all the instances(method and variable).even if we create multiple objects ,it will allocate the same memory location to the object
    //steps of designing a singleton design pattern
    //1.) the constructor should be private
    //2.) we should create a public static method with return type as the constructor
    //3.) create a private static reference variable of a class and keep it as null
    public static void main(String[] args) {

//To call the constructor we need to call the method which will craete an object and return the constructor
        System.out.println(method());//this will give the memory location of the method created by the constructor


    }
}
