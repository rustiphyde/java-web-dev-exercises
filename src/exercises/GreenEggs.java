package exercises;

import java.util.Arrays;

public class GreenEggs {

    public static void main(String[] args){

        String poem = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

//        String[] words = poem.split(" ");
        String[] sentences = poem.split("\\.");

        System.out.println(Arrays.toString(sentences));
    }
}
