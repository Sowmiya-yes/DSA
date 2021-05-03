package AlgoExpert;

class LL {
    int data;
    LL next;

    LL(int val) {
        data = val;
    }
}
public class MergeLinkedList {
    public static void main(String[] args) {
        LL list1 = new LL(5);
        list1.next = new LL(10);
        list1.next.next = new LL(15);

        LL list2 = new LL(2);
        list2.next = new LL(11);
        list2.next.next = new LL(13);

        LL list3 = new LL(-1);
        LL head = list3;

        while(list1 != null && list2 != null) {
            if(list1.data < list2.data)  {
                list3.next = list1;
                list1 = list1.next;
            } else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }

        if(list1 != null) {
            list3.next = list1;
        }

        if(list2 != null) {
            list3.next = list2;
        }

        head = head.next;
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}

//Time - O(n) - n is the size of small list
// space - O(m+n) m,n - size of lists