package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenList {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>( Arrays.asList(16, 45, 67, 58, 10, 78, 23, 34, 19, 27));

        int evenSum = addEvens(numbers);

        System.out.println("the sum of all the even numbers in the list is " + evenSum);


    }

    private static int addEvens(ArrayList<Integer> nums){
        int sum = 0;
        for(Integer num: nums){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
