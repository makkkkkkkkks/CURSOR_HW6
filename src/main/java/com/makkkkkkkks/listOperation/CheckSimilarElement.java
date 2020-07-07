package main.java.com.makkkkkkkks.listOperation;

import java.util.List;

public class CheckSimilarElement {
    private List listA;
    private List listB;

    public CheckSimilarElement(List listA, List listB) {
        this.listA = listA;
        this.listB = listB;
    }

    public void check() {
        System.out.println("Original list A");
        System.out.println(listA);
        System.out.println("Original list B");
        System.out.println(listB);
        System.out.println("Common elements ");
        listA.retainAll(listB);
        System.out.println(listA);
    }
}
