public class ClassesAndObjectAssignment {
    public static void main(String[] args) {
        HumanClass Human = new HumanClass();
        Human.age = 31;
        Human.name = "Khushboo";
        Human.speak();



        MyMobilePhone mobile = new MyMobilePhone();
        mobile.launchYear= 2024;
        mobile.modelName ="Samsung";
        mobile.mobile1();

    }



}
    //object Human
    class HumanClass{
        int age;
        String name;
        public void speak(){
            System.out.println("My name is "+name+" and age is "+age+"");

        }
    }
    //Object MObilePhone
    class MyMobilePhone {
        int launchYear;
        String modelName;

        public int mobile1() {
            for (int i = 0; i < 3; i++) {
                System.out.println("I have a Samsung phone");

            }
            int j = 0;
            while (j < 3) {
                System.out.println(j);
                j++;
            }
            return j;
        }

        //Object Desktop
        class NewDesktop {
        }

        //Object College
        class BigCollege {
        }

        //Object TestSuite
        class PracticeTestSyuite {
        }

        //Object TestClass
        class PracticeTEstClass {
        }

        //Object TestStep
        class NewTestStep {
        }

        //object Fan
        class TableFan {
        }

        //Object Room
        class BedRoom {
        }

        //Object Student
        class NewStudents {
        }

        //Object Books
        class JavaBooks {
        }

        //Object Data
        class PersonalData {
        }
    }

