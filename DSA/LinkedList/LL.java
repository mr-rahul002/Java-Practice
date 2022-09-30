

import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.addFirst("a");
        ls.addFirst("is");
        System.out.println(ls);

        ls.addFirst("this");
        ls.add("list");
        // add or addlast same

        System.out.println(ls);
        System.out.println(ls.size());

        for (int i = 0; i < ls.size(); i++) {
            // for searching
            // if(ls.get(i)==value)
            System.out.print(ls.get(i) + "->");

        }
        System.out.println("null");

        ls.removeFirst();
        System.out.println(ls);

        ls.removeLast();
        System.out.println(ls);

        ls.addFirst("this");

        ls.remove(1);
        System.out.println(ls);

    }
}
