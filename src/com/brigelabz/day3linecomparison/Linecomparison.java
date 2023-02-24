package com.brigelabz.day3linecomparison;

import java.util.Scanner;

public class Linecomparison {
    static void compareLines(double lineLength1, double lineLength2){
        if(lineLength2 == lineLength1){
            System.out.println("Lines are of same length");
        }else if(lineLength2> lineLength1){
            System.out.println("Second line is larger than first");
        } else {
            System.out.println("Second line is smaller than first");
        }
    }

    static double getLineLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting point of the first line");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("Enter the ending point of first the line");

        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double lineLength1 = getLineLength(x1,y1,x2,y2);

        System.out.print("Enter the starting point of the second line");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.print("Enter the ending point of second the line");

        int x4 = scan.nextInt();
        int y4 = scan.nextInt();

        double lineLength2 = getLineLength(x3,y3,x4,y4);

        compareLines(lineLength1, lineLength2);
    }
}
