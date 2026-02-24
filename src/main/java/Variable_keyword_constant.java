public class Variable_keyword_constant {
    public static void main (String[]args){

        //Keyword :it has a predefined value and always writtenin lower case with orange color injava
        //here public,static,void,class are keyword

        //variables:the value which can be changed , it is defined with a datatype
        //here "i" is the variable with data type "int" and 50,100 and 1000 are the values we passed

        int i = 50;
        System.out.println(i);
        i=100;
        System.out.println(i);
        i=5000;
        System.out.println(i);


        //Constants: when we apply "Final" keyword with a variable its constant
        //its value is fixed and cannot be changed

        final int j = 300;
        System.out.println(j);

//        The below will give error as j =300 is already defined
//        j= 2000;
//        System.out.println(j);



        //Parameterization of variable , to use 2 or more than 2 variable in a sentence we use "+stringname+"

        int batchno = 60;
        String studentName = "Khushboo";
        String className = "javalearning";
        System.out.println(""+studentName+" is attending "+className+" batch number "+batchno+"");
        // the below will give an error as the variable name is a keyword
        //String class = "techelleptica";

    }


}
