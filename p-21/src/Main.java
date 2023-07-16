import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(List.of(1, 2, 4).iterator()), new ListNode(List.of(1, 3, 4).iterator())));
    }

    public static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if(node1 == null) return node2;
        if(node2 == null) return node1;

        if (node1.val < node2.val) {
            node1.next = mergeTwoLists(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeTwoLists(node1, node2.next);
            return node2;
        }
    }
}