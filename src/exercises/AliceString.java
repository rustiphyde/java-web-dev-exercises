package exercises;

import java.util.Scanner;

public class AliceString {

    public static void main(String[] args){

        String sentence = "Alice was beginning to get very tired of sitting by her" +
                "sister on the bank, and of having nothing to do: once or" +
                "twice she had peeped into the book her sister was" +
                "reading, but it had no pictures or conversations in it," +
                "'and what is the use of a book,' thought Alice 'without" +
                "pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for:\n");
        String term = input.next();
        Boolean result = sentence.toLowerCase().contains(term.toLowerCase());
        if(result){
            System.out.println("Your search term was " + term + ", it has a length of " + term.length() + " characters and can be found in the sentence at index " + sentence.indexOf(term));
        } else {
            System.out.println("Your search term was " + term + ", it has a length of " + term.length() + " characters but cannot be found in the sentence");
        }
    }
}
