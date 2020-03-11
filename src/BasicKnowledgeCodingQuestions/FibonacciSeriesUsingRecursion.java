package src.BasicKnowledgeCodingQuestions;

import java.util.Scanner;

/**
 * Fibonacci number is the sum of previous two Fibonacci numbers fn = fn-1+fn-2
 * first 10 Fibonacci numbers are 1,1,2,3,5,8,13,21,34,55c
 *
 * @author Tara**/
public class FibonacciSeriesUsingRecursion {

    public static void main(String[] args) {

        System.out.println("Enter number upto which Fibonacci series to print:");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + " numbers:");

        //printing fibonacci series upto a number
        // for recursion don't forget to start iteration with 1 but not with 0, otherwise it will give error.
        for(int i=1; i<=number; i++){
            System.out.println(fibonacci(i)+" ");
        }
    }

    /**
     * Java Program to calculate Fibonacci series using recursion
     * This program used tail recursion to calculate Fibonacci series for a given number
     * @return Fibonacci number**/

    public static int fibonacci(int number){
        if(number ==1 || number ==2){
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);//tail recursion
    }


}
