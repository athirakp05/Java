import java.util.*;

public class Pgrm31 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> HS = new LinkedHashSet<>();
        HS.add(1);
        HS.add(2);
        HS.add(3);
        HS.add(4);
        HS.add(5);
        System.out.println("Set =" + HS);
        HS.remove(5);
        int x = HS.size();
        System.out.println("Size of Set object=" + x);
        HS.remove(2);
        System.out.println("Set =" + HS);
    }
}