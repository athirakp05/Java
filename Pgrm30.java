import java.util.*;

public class Pgrm30 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        System.out.println("inserting Three elements:");
        for (Integer integer : dq) {
            System.out.println(integer);
        }
        dq.pop();
        System.out.println("After Poping");
        for (Integer integer : dq) {
            System.out.println(integer);
        }
        dq.remove(3);
        System.out.println("Removing the element" + dq);

    }
}