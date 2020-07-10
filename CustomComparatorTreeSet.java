package main.java.com.makkkkkkkks.listOperation;

import java.util.Arrays;
import java.util.TreeSet;

public class CustomComparatorTreeSet implements Comparable<CustomComparatorTreeSet> {
    private TreeSet<Object> treeSet;
    private TreeSet<Object> treeSetDesc;

    public CustomComparatorTreeSet(Integer... integers) {
        treeSet = new TreeSet<Object>(Arrays.asList(integers));
    }

    public void treeSortDesc() {
        treeSetDesc = (TreeSet<Object>) treeSet.descendingSet();
        System.out.println("Without descendingSet(): " + treeSet);
        System.out.println("With descendingSet(): " + treeSetDesc);
    }

    @Override
    public int compareTo(CustomComparatorTreeSet tree) {
        return tree.compareTo(treeSet);
    }
}
    CustomComparatorTreeSet customComparatorTreeSet = new CustomComparatorTreeSet(1,2,5,345,-2);
        customComparatorTreeSet.treeSortDesc();