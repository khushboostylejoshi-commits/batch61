package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        //a 2-D Array consist of rows and column in the form of a matrix

        String names[][]= new String[2][2];
        names[0][0]="khushboo";
        names[0][1]="nandini";
        names[1][0]="Kusha";
        names[1][1]="Aditya";
        System.out.println(names[1][0]);
        System.out.println(names.length);//lenght of rows only
        System.out.println(names[0].length);//lenght of columns only
        //To print all the array val

        for(int row=0; row<names.length;row++){
            for (int col=0;col<names[0].length;col++) {
                System.out.println(names[row][col]);
            }
            }
        }

    }

