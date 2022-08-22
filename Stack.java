package Day14StacksAndQueue;

import java.util.Scanner;
import com.bridgelabz.LinkedList;

public class Stack {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Choose option to perform task:" + "1. Create a stack");
        int option = sc.nextInt();
        switch (option) {
            case 1 :
                list.push(70);
                list.push(30);
                list.push(56);
                list.show();
                break;
        }

    }

}
