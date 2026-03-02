public class ClassAssignment {
    //creating some instance variable
    int noOfTestCases;
    String NameOFProject;

    public static void main (String[] args){
        //To call all the other variables in this class and the method in this calss we need to create object
        test subclass = new test();
        ClassAssignment assignment = new ClassAssignment();

        assignment.NameOFProject= "Methods";
        assignment.noOfTestCases=1;
        subclass.noOfLinesOfCode=10;
        subclass.scenarioCovered="classes";
        subclass.scenario();



    }
    static class test {
        int noOfLinesOfCode;
        String scenarioCovered;

        public void scenario(){
            System.out.println("This is a method in a class");
        }

    }
}
