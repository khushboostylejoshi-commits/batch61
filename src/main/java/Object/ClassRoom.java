package Object;

public class ClassRoom {
//The variable which can be used by an object should alwayd defined before the main method just after the calss name  or after the main method.
// to create an object we need to initialize the object with a name
//classname objectvariable =new  classnmae();
//To call the variable using the object we can use .,objectname.variable .and then we can assign the values to that variable in that class
    String studentnames;
    String techerNames;
    int noOfStaff;
    int noOfChairs;
    int noOfFans;
    String subject;
    String topic;
    public static void main(String[] args) {


        ClassRoom class1 = new ClassRoom();
        ClassRoom class2 = new ClassRoom();
        ClassRoom class3 = new ClassRoom();



        class1.noOfChairs=4;
        class1.studentnames="Khushboo";
        class1.techerNames="me";

        class2.studentnames="Adi";
        class2.techerNames="him";
        class2.noOfChairs=10;


        class3.noOfChairs=9;
        class3.techerNames="kusha";
        class3.studentnames="kusha";



    }
}
