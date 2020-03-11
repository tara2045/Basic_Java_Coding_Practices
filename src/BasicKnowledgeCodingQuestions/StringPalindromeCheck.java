package src.BasicKnowledgeCodingQuestions;

import java.util.Scanner;

/**
 * @author Tara P
 *
 * We also have reverse() which will directly do this part on easy way
 */
public class StringPalindromeCheck {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the word you want to test for palindrome");

        //working with string you have to read next line
        String input = reader.nextLine();
        System.out.println(isPalindrome(input));

        //Don't forget to close reader, otherwise it will cache the string and my not
        // produce right result on second time
        reader.close();
    }

    private static boolean isPalindrome(String input) {

        if(input == null || input.isEmpty()){
            return false;
        }

        char[] array = input.toCharArray(); //toCharArray() method converts the given string into a sequence of characters.

        StringBuilder sb = new StringBuilder((input.length())); //be careful on this line

        for(int i = input.length() - 1; i >= 0; i--){
            sb.append(array[i]);
        }

        String reverseInput = sb.toString();

        return input.equalsIgnoreCase(reverseInput);
    }
}
