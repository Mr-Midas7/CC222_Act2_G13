import java.util.Scanner;

class Nod {
    int data;
    Nod next;

    public Nod(int d) {
        data = d;
        next = null;
    }
}

class singleLinkedList {
    Nod head;

    public void insertBegin(int d) {
        Nod newNod = new Nod(d);
        newNod.next = head;
        head = newNod;
    }

    public void insertEnd(int d) {
        Nod newNod = new Nod(d);
        if (head == null) {
            head = newNod;
            return;
        }
        Nod last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNod;
    }

    public void print() {
        Nod la = head;
        while (la != null) {
            System.out.println(la.data);
            la = la.next;
        }
        System.out.println("null");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        singleLinkedList n = new singleLinkedList();
        int[] array = new int[10];
        int arrayindx = 0;

        while (true) {
            System.out.println("enter Value");
            int ns = sc.nextInt();
            System.out.println("1.array");
            System.out.println("2.singleLinkedList");
            int op = sc.nextInt();

            if (op == 1) {
                if (arrayindx < array.length) {
                    array[arrayindx++] = ns;
                    System.out.println(java.util.Arrays.toString(array));
                } else {
                    System.out.println("puno na tapos na");
                }
            } else if (op == 2) {
                System.out.println("1. Insert at beginning");
                System.out.println("2. Insert at end");
                int llo = sc.nextInt();

                if (llo == 1) {
                    n.insertBegin(ns);
                    n.print();

                } else if (llo == 2) {
                    n.insertEnd(ns);
                    n.print();
                } else {
                    System.out.println("error");
                }

            }
            System.out.println("Enter new value? (1 yes=2 no)");
            int eop = sc.nextInt();

            if (eop == 2) {
                break;
            }

        }

    }

}
