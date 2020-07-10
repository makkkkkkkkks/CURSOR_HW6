package main.java.com.makkkkkkkks.listOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisible {
    private List<Integer> list;

    public Divisible(Integer... integers) {
        list = new ArrayList(Arrays.asList(integers));
    }

    public void removeElement() {
        list.removeIf(i -> (Integer) i % 3 == 0);
        list.forEach(b -> System.out.println(b + " "));
        System.out.println("  ");
    }
}
