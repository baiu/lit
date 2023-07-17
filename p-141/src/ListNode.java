import java.util.Iterator;

public class ListNode {

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

    ListNode(Iterator<Integer> values) {
        if (values.hasNext()) {
            this.val = values.next();
            this.next = values.hasNext() ? new ListNode(values) : null;
        }
    }
}
