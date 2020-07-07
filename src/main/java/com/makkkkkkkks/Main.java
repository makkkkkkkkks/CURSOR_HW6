package main.java.com.makkkkkkkks;

import main.java.com.makkkkkkkks.listOperation.CheckSimilarElement;
import main.java.com.makkkkkkkks.listOperation.CustomComparatorTreeSet;
import main.java.com.makkkkkkkks.listOperation.Divisible;
import main.java.com.makkkkkkkks.listOperation.FruitReplace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Divisible divisible = new Divisible(3, 6, 9, 12, 13, 18, 16);
        divisible.removeElement();

        FruitReplace fruitReplace = new FruitReplace("orange", "babana", "pineapple", "melone", "strawberry");
        fruitReplace.replaceFruit("orange", "grapefruit");

        List listA = new ArrayList<Integer>();
        List listB = new ArrayList<Integer>();

        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(6);

        listB.add(1);
        listB.add(2);
        listB.add(4);
        listB.add(7);
        CheckSimilarElement checkSimilarElement = new CheckSimilarElement(listA, listB);
        checkSimilarElement.check();

        CustomComparatorTreeSet customComparatorTreeSet = new CustomComparatorTreeSet(1,2,5,345,-2);
        customComparatorTreeSet.treeSortDesc();
    }
}
