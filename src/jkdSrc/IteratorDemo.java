package jkdSrc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");
        Iterator iterator = a.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
