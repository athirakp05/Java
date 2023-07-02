import java.util.8;

public class Pgrm34 {
    public static void main(String[] args) {
        Map<String, string> map = new HashMap<>();
        System.out.println("Enter the limit:");
        Scanner imp = new Scanner(System.in);
        System.out.println("Enter the Rollno and Name:");
        while (n != 0) {
            String e = inp.next();
            String s = inp.next();
            map.put(e, s);
            n--;
        }
        System.out.println("HashMap:" + map);
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        System.out.println("TreeMap:" + treeMap);

    }
}