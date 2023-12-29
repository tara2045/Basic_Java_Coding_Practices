package src.CollectionsQuestions;

import java.util.ArrayList;

/**
 * @author Tara P
 */
public class ConvertArrayListToArray_Using_ToArray {

    public static void main(String[] args) {


    //ArrayList Initialization
    ArrayList<String> arrList = new ArrayList<String>();
    arrList.add("\nApple");
    arrList.add("Banana");
    arrList.add("Mango");
    arrList.add("Pear");

    //ArrayList to array Conversion, create new array of same size as the arrayList
    String array[] = new String[arrList.size()];
    for(int i=0; i<arrList.size(); i++){
        array[i] = arrList.get(i);
    }

    //Displaying Array Elements
        for(String j : array){
        System.out.println(j);
    }

    }



}
