
//program to create a generic stack and do the Push amd Pop
import java.util.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class operations {
    public void operation() {
        int top = -1, ch, n, e;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Size of Stack");
        n = inp.nextInt();
        int size = n - 1;
        int[] arr = new int[n];
        do {
            System.out.println("\n........\n MENU :\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
            System.out.println("Enter The choice:");
            ch = inp.nextInt();
            switch (ch) {
                case 1:
                    if (top == size) {
                        System.out.println("stack is full!!!!!");
                    } else {
                        System.out.println("Enter Element:");
                        e = inp.nextInt();
                        top++;
                        arr[top] = e;
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("\n" + arr[top] + "is removed!");
                        top--;
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("...Stack is Emply...!");
                    } else {
                        System.out.println("\n...Stack:...\n");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(" " + arr[i]);
                            System.out.println("....");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid operations");
            }
        } while (ch != 4);
    }
}

public class Pgrm24 {
    public static void main(String args[]) {
        operations obj = new operations();
        obj.operation();
    }
}
