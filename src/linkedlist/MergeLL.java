package Day1.linkedlist;

class Header {
    LL head;

    public Header() {
        this.head = null;
    }

    public void insert(Header root, int i) {
        LL head = root.head;
        while(head.next != null) {
            head = head.next;
        }
        head.next = new LL(i);
    }

    public void display(Header root) {
        LL head = root.head;
        while(head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }

    public void mergeSortedLL(Header root1, Header root2) {
        LL ptr1 = root1.head, ptr2 = root2.head;
        LL head = new LL(0);
        LL tail = head;
        while (ptr1 != null && ptr2 != null) {
            if(ptr1.data < ptr2.data) {
                tail.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                tail.next = ptr2;
                ptr2 = ptr2.next;
            }
            tail = tail.next;
        }
        if(ptr1 == null) {
            tail.next = ptr2;
        } else {
            tail.next = ptr1;
        }
        head = head.next;
        System.out.println();
        while(head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }
}
public class MergeLL {
    public static void main(String[] args) {
        Header root = new Header();
        root.head = new LL( 1);
        root.insert(root, 3);
        root.insert(root, 5);
        root.insert(root, 7);
        root.insert(root, 9);

        Header root1 = new Header();
        root1.head = new LL( 0);
        root1.insert(root1, 2);
        root1.insert(root1, 4);
        root1.insert(root1, 6);
        root1.insert(root1, 8);

        root.display(root);

        System.out.println();

        root1.display(root1);

        root.mergeSortedLL(root, root1);
    }
}

