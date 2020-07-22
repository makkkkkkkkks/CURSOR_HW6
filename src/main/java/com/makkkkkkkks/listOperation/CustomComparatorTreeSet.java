package main.java.com.makkkkkkkks.listOperation;

import java.util.TreeSet;

public class CustomComparatorTreeSet implements Comparable<CustomComparatorTreeSet> {
    private final TreeSet<Object> treeSet;

    public CustomComparatorTreeSet(Integer... integers) {
        treeSet = new TreeSet<Object>();
        for (int i = 0; i < integers.length; i++) {
            treeSet.add(integers[i]);
        }
    }

    @Override
    public int compareTo(CustomComparatorTreeSet o) {
        return o.compareTo(o);
    }

    @Override
    public String toString() {
        return "sorted TreeSet => " + treeSet;
    }
}