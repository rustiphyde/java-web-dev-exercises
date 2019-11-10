package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double rad = input.nextDouble();
//        double area = pi * (rad * rad);
        Double area = Circle.getArea(rad);
        System.out.println("The area of your circle is " + area);
    }
}
