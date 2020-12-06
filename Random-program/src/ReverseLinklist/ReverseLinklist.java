package ReverseLinklist;

import java.util.LinkedList;

public class ReverseLinklist {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public String toString() {
            return val + "";
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Given Linked list");
        printList(head);

        head = reverseList(head);

        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(head);
    }


}


// about link list nothing do with reverse linklist
class LinkList {
    void list() {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("anup");
        linkedList.add("anup1");
        linkedList.add("anup2");
        linkedList.add("anup3");

        System.out.println(linkedList);

        linkedList.remove();
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);

        linkedList.add("anup");
        linkedList.add("anup1");
        linkedList.add("anup2");
        linkedList.add("anup3");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));


        for (String s : linkedList) {
            if (s.equals("anup2")) {
                System.out.println("We found anup2");
            }
        }
        System.out.println(linkedList.isEmpty());
    }
}