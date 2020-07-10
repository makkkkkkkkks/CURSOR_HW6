package main.java.com.makkkkkkkks.listOperation;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public  static void start(){
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


    }
}
