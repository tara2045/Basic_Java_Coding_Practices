package src.BasicKnowledgeCodingQuestions;

import java.util.Scanner;

/**
 * @author Tara P
 */
public class IsPrimeOrNot {

    public static void main(String[] args) {

        System.out.println("Enter number to check if prime or not");

        int number = new Scanner(System.in).nextInt();

        System.out.println(isPrimeOrNot(number));

    }

    /*
    * This is the simplest way i found to find prime number or not
    * Its difficult to remember number 24, but that we can remember as 5*5-1, which is first prime
    * number that we want to check.
    * */

    private static String isPrimeOrNot(int number) {

        if (number < 0){
            return "not valid";
        }
        if(number == 2 || number ==3){
            return "prime number";
        }
        if(number == 0 || number == 1){
            return "not prime number";
        }
        if(number % 2 == 0){
            return "not prime number";
        }

        if((number * number -1) % 24 ==0){
            return "prime number";
        }
        else{
            return"not prime number";
        }
    }

}
