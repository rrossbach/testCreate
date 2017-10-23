import javax.swing.*;

public class ArrayWork {

    public static void main(String args[]) {
        String[][] names = {{"Jack","Emma","Matt"},
                            {"David","Lauren","Arianna"}};

        System.out.println("the array has " + names.length + " rows");
        for (int row = 0; row < names.length; row++) {
            System.out.println("Starting row: " + row);
            for (int column = 0; column < names[row].length; column++) {
                System.out.print("row: " + row + " col: " + column);
                System.out.println(": Hi " + names[row][column] + "!");
            }
        }
    }


}