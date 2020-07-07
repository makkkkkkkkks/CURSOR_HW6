package main.java.com.makkkkkkkks.listOperation;

import java.util.TreeSet;

public class CustomComparatorTreeSet {
    private TreeSet<Object> treeSet;
    private TreeSet<Object> treeSetDesc;

    public CustomComparatorTreeSet(Integer... integers) {
        treeSet = new TreeSet<Object>();
        for (int i = 0; i < integers.length; i++) {
            treeSet.add(integers[i]);
        }
    }

    public void treeSortDesc() {
        treeSetDesc = (TreeSet<Object>) treeSet.descendingSet();
        System.out.println("Without descendingSet(): " + treeSet);
        System.out.println("With descendingSet(): " + treeSetDesc);
    }
}
