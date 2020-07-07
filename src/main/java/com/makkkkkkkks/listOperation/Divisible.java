package main.java.com.makkkkkkkks.listOperation;

import java.util.ArrayList;
import java.util.List;

public class Divisible {
    private List list;

    public Divisible(Integer... integer) {
        list = new ArrayList<Integer>();
        for (int i = 0; i < integer.length; i++) {
            list.add(integer[i]);
        }
    }

    public void removeElement() {
        list.removeIf(i -> (Integer) i % 3 == 0);
        list.forEach(b-> System.out.println(b + " " ));
        System.out.println( "  ");
    }
}
