import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(List.of(3, 2, 0, -4).iterator());
        listNode.next.next.next.next = listNode.next;
        System.out.println(hasCycle(listNode));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next; //2 times
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}