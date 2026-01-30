public class ConvertBinaryNumberinaLinkedListtoInteger {
    public static void main(String[] args) {
        ListNode h = new ListNode(1, new ListNode(0, new ListNode(1)));
        getDecimalValue(h);

    }

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
    }

    public static int getDecimalValue(ListNode head) {
        int binNumber = 0;
        while(head!=null){
            binNumber = binNumber*2 + head.val;
            head = head.next;
        }
        System.out.println(binNumber);

        return 1;

    }
}
