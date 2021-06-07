package MPE7.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex07 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //inputs
        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();

        //string convert
        int intlength =Integer.parseInt(length);
        int intwidth =Integer.parseInt(width);

        //math
        int area = intlength * intwidth;
        int meter = area * 2 * 0.0929034 / 2;

        //Output string
        String outputString = "The area is\n"+area+" square feet\n"+meter+" square meters";

        //Output
        System.out.println(outputString);
    }
}
