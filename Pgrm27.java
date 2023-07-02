
//package co4Q11;
import java.util.*;

public class Pgrm27 {
    public static void main(String[] args) {
        LinkedList<String> L = new LinkedList<>();
        L.add("Gold");
        L.add("Silver");
        L.add("Bronze");
        L.add("Gold1");
        L.add("Silver1");
        L.add("Bronze1");
        System.out.println(L);
        L.remove("Bronze");
        System.out.println(L);
        L.remove(2);
        System.out.println(L);
        L.removeLast();
        System.out.println(L);
        L.removeFirst();
        System.out.println(L);
    }
}