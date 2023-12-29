package src.CollectionsQuestions;

import java.util.ArrayList;

/**
 * @author Tara P
 */

//Write a program to traverse(or iterate) ArrayList?
public class ArrayListLoopExample {

    public static void main(String[] args) {
        //initialize ArrayList
        ArrayList<String> al = new ArrayList<String>();

        //add elements to ArrayList object
        al.add("Tara");
        al.add("Karishma");
        al.add("Prasad");
        al.add("Adhikari");
        al.add("Kathmandu");

        System.out.println("Using Advanced For Loop:");

        for(String num : al){
            System.out.println(num);
        }
    }
}
