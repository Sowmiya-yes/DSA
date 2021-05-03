package Day1.linkedlist;

class LL {
    int data;
    LL next;

    public LL(int data) {
        this.data = data;
        this.next = null;
    }
}

class Head {
    LL head;

    public Head() {
        this.head = null;
    }

    public void insert(Head root, int i) {
        LL head = root.head;
        while(head.next != null) {
            head = head.next;
        }
        head.next = new LL(i);
    }

    public void display(Head root) {
        LL head = root.head;
        while(head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }

    public void reverse(Head root) {
        LL head = root.head;
        LL prev = null;
        LL current = head;
        LL next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        root.head = prev;
    }

    public void findMiddleElement(Head root) {
        LL head = root.head;
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        int mid = count / 2, i = 0;
        head = root.head;
        while(i < mid) {
            i++;
            head = head.next;
        }
        System.out.println(head.data);
    }

    public void findMiddleElementOptimised(Head root) {
        LL ptr1 = root.head;
        LL ptr2 = root.head;
        while(ptr2 != null) {
            ptr2 = ptr2.next.next;
            ptr1 = ptr1.next;
        }
        System.out.println(ptr1.data);
    }
}
public class ReverseLL {
    public static void main(String[] args) {
        Head root = new Head();
        root.head = new LL(0);

        root.insert(root, 1);
        root.insert(root, 2);
        root.insert(root, 3);
        root.insert(root, 4);
        root.insert(root, 5);
        root.insert(root, 6);

        root.display(root);
//
//        root.reverse(root);
//
        System.out.println();
//        root.display(root);

//        root.findMiddleElement(root);
        root.findMiddleElement(root);
    }
}
