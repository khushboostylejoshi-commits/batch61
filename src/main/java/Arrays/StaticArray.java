package Arrays;

public class StaticArray {
    public static void main(String[] args) {
        //Array: to store a list of values in a single variable we use array
        //Array start with a 0th value and the last value of array is always n-1
        //a square is used to define array
//Int array
        int i[]={10,20,30};
        String val[] ={"age,name,class,marks"};

        //Another way of declaring an array is to first declare the size
        int j[] = new int[3];
        //here the variable is j which is an array variable and the size of the array is 7
        //it starts from 0 and end a 6
        j[0] = 10;
        j[1] = 20;
        j[2] = 30;
        System.out.println(j[1]);
        //it will print the value in the j[index1]

        //To run a loop for an array
        for(int k =0; k< j.length; k++){
            System.out.println(k);
            System.out.println(j[k]);
        }

        //Character array
        char alph[]= new char[3];
        alph[0] = 'a';
        alph[1]='b';
        alph[2]='3';

        //Boolean array
        boolean result[] = new boolean[2];
        result[0]=true;
        result[1]=false;

        //double array
        double frcational[] = new double[3];
        frcational[0]= 12.7989;
        frcational[1]= 13.9087;
         frcational[2]= 57858.9080;

         //string Array
        String name[] =new String[2];
        name[0]="khushboo";
        name[1]="joshi";
        System.out.println(name.length);


        //All the above arrays are called as 1-Dimensional array
        //Advantage of 1-D array
        //we can store more than one value with same datatyoe in an array
        //Limitatiomn of 1-D array
        //The size of 1-D array is fixed ,we cannot add the data more than the size of the array ,once we define the size
        //-to overcome this issue we use collections or 2-D array(Dynamic array)
        //It can only carry same datatype
        //-to overcome this issue we use object array

      //Object array(Object is a class)
        Object obj[] = new Object[2];
        obj[0]="Tom";
        obj[1]=12;
        obj[2]='s';
        //we can use multiple dat type in object array
        //We can use this to store differnt data type in single variable
    }

    }

