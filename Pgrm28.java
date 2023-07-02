
// Aim: Program to remove a n object from the stack when position is passed as parameter
import java.util.*;

public class Pgrm28 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        System.out.println("stack=" + st);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Position:");
        int x = sc.nextInt();
        st.remove(x);
        System.out.println("Stsck=" + st);
    }
}
