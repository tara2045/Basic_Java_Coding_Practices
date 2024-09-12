package src.ComparatorImplementationUsingHashmap;

import java.util.*;
import src.ComparatorImplementationUsingHashmap.CategoryComparator;

/**
 * @author Tara P
 */
public class MainSortClass {

    public static void main(String[] args) {

        List<RefinementOptions> refinementOptions = new ArrayList<RefinementOptions>();

        String categorySort = "All,Devices,Accessories,Home Internet & TV,Business,Support,Community,Business,News,Other";

        List<String> listB = Arrays.asList(categorySort.toLowerCase().split("\\s*,\\s*"));

        Map<String, Integer> sortOrderMap = new HashMap<String, Integer>();

        for(int k = 0; k<listB.size(); k++){
            String weekday = listB.get(k);
            sortOrderMap.put(weekday,k);
        }

        Collections.sort(refinementOptions, new CategoryComparator(sortOrderMap));

        System.out.println("Finished");
    }
}

