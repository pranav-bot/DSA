
public class LinkedListCycle {
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            {
                val = x;
                next = null;
            }
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head.next == null) {
            return false;
        }
        return true;
    }
}
