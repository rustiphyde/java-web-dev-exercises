package exercises;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you travel:\n");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas did you consume:\n");
        Integer guzzled = input.nextInt();
        Integer gasMiles = miles / guzzled;
        System.out.println("You are getting " + gasMiles + " miles per gallon");
    }
}
