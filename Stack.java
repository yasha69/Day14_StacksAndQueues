package Day14StacksAndQueue;

import java.util.Scanner;
import com.bridgelabz.LinkedList;

public class Stack {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Choose option to perform task:\n" + "1. Create a stack\n"
                        + "2. Pop from the stack till empty.\n");
        int option = sc.nextInt();
        switch (option) {
            case 1 :
                list.push(70);
                list.push(30);
                list.push(56);
                list.show();
                break;
            case 2 :
                list.push(70);
                list.push(30);
                list.push(56);
                list.show();
                int s=list.getSize();
                for(int i=0; i<s; i++) {
                    list.pop();
                    list.show();
                }
                break;
        }

    }

}