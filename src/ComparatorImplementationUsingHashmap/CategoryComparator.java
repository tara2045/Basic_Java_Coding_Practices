package src.ComparatorImplementationUsingHashmap;

import java.util.Comparator;
import java.util.Map;
import src.ComparatorImplementationUsingHashmap.RefinementOptions;

/**
 * @author Tara P
 */
public class CategoryComparator implements Comparator<RefinementOptions> {
    private Map<String, Integer> sortOrder;

    public CategoryComparator(Map<String, Integer> sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(RefinementOptions i1, RefinementOptions i2){
        Integer labelPos1 = sortOrder.get(i1.getLabel().toLowerCase());
        if(labelPos1 == null){
            labelPos1 = 0;
        }

        Integer labelPos2 = sortOrder.get(i1.getLabel().toLowerCase());
        if(labelPos2 == null){
            labelPos2 = 0;
        }

        return labelPos1.compareTo(labelPos2);

    }
}

