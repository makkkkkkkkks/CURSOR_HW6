package main.java.com.makkkkkkkks.listOperation;

import java.util.Arrays;
import java.util.List;

public class FruitReplace {
    private final List<String> list;

    public FruitReplace(String... fruits) {
        list = Arrays.asList(fruits);
    }

    public void replaceFruit(String listFruit, String replaceFruitTo) {
        if (list.contains(listFruit)) {
            int orangeIndex = list.indexOf(listFruit);
            list.set(orangeIndex, replaceFruitTo);
        } else {
            System.out.println(listFruit + " not present. ");
        }
        list.forEach(ls -> System.out.println(ls));
        System.out.println(" ");
    }
}
