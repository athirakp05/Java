import java.util.*;

public class Pgrm32 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("red");
        h_set.add("pink");
        h_set.add("black");
        h_set.add("orange");
        h_set.add("green");
        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("red");
        h_set2.add("pink");
        h_set2.add("black");
        h_set2.add("orange");
        for (String element : h_set) {
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
    }
}
