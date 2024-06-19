package CollectionFramework;

import java.util.*;

public class Dequeue {

    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("akash");
        deque.add("santosh");
        deque.add("swapnil");
        // Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
