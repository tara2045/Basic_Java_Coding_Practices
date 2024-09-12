package src.BasicKnowledgeCodingQuestions;

import java.util.Scanner;

/**
 * Fibonacci number is the sum of previous two Fibonacci numbers fn = fn-1+fn-2
 * first 10 Fibonacci numbers are 1,1,2,3,5,8,13,21,34,55c
 *
 * @author Tara**/
public class FibonacciSeriesUsingIteration {

    public static void main(String[] args) {

        System.out.println("Enter number upto which Fibonacci series to print:");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + " numbers:");

        for(int i=0; i<=number; i++){
            System.out.println(fibonacci2(i)+" ");
        }
    }

    /**
     * Java Program to calculate Fibonacci series using Iteration or Loop
     * @return Fibonacci number**/

    public static int fibonacci2(int number){
        if(number ==1 || number ==2){
            return 1;
        }

        int fibo1=1, fibo2=1, fibonacci =1;
        for(int i=3; i<=number; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;
    }


}
