package CustomPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileClassesJava {
    public static void main(String[] args) throws IOException {
        //We can perform file related function using this already available file class in Java


        //To create a Folder
//        String pathName ="C:\\Users\\Khushboo Joshi\\Documents\\intellIJProject\\batch61\\FileClassFolder";
//        File f1 = new File(pathName);
//        f1.mkdir();

        //As the path given in the string pathName is not a generic path and will not work in any other system we use a generic path

        String pathName2 =System.getProperty("user.dir")+"\\NewFileClassFolder\\TestFile.txt";
        File f2 = new File(pathName2);
//        f2.mkdir();
        //To create a file inside the folder
        //a exception will be given to handle that java provides throw exception at the top
        f2.createNewFile();
        //To write something in the file we use writer class
        //creating object for writer class
        FileWriter writer = new FileWriter(pathName2);
        writer.write("My name is khushboo");
//        writer.close();

        //To append anything in the file class we use append as true which will carry all the old writen values in the class otherwise it would only take the new values(Input)
        //default value is false for append

        FileWriter writer1 = new FileWriter(pathName2,true);
        writer.write("I am married");
//        writer.close();
        }
    }

