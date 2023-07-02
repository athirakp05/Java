
// Aim: maintain a list of strings using arraylist from collection framework perform builtin operations
import java.util.*;

public class Pgrm26 {
    public static void main(String args[]) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("alpha");
        obj.add("beta");
        obj.add("gamma");
        obj.add("phi");
        System.out.println("\n Original ArrayList");
        for (String str : obj)
            ;
        System.out.print(str);
        obj.add(1, "Hamiltonian");
        System.out.println("Arraylist after add operation");
        for (string str : obj)
            System.out.println(str);
        obj.remove("hamiltonian");
        System.out.println("\n ArrayList after remove operation");
        for (String str : obj)
            System.out.println(str);
        obj.remove(3);
        system.out.println("\n Final ArrayList");
        for (String str : obj)
            System.out.println(str);
        Collections.sort(obj);
        System.out.println("Arralist After Sorting");
        for (String str : obj)
            System.out.println(str);
        System.out.println("\n Object at index2:" + obj.get(2));
        System.out.println("\n six is in the ArrayList" + obj.contains("degree"));
        System.out.println("Two is in the ArrayList" + obj.contains("dell"));
        System.out.println("Size of the ArrayList" + pbj.size());

    }

}
