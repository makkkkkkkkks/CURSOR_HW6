package main.java.com.makkkkkkkks.listOperation;

import java.util.ArrayList;
import java.util.List;

public class FruitReplace {
    private List list;

    public FruitReplace(String... fruit) {
        list = new ArrayList<String>();
        for (int i = 0; i < fruit.length; i++) {
            list.add(fruit[i]);
        }
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
