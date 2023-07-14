import java.util.Arrays;

class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(1);
        System.out.println(removeNthFromEnd(l2, 2));

        int ans = addTwoNumbers(l1, l2);
        // System.out.println(Arrays.toString(ans));
        System.out.println(ans);

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        };

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static int traverse(ListNode l1) {
        int n1 = 0;
        while (l1 != null) {
            int temp = l1.val;
            n1 = n1 * 10 + temp;
            l1 = l1.next;
        }
        return n1;
    }

    public static int addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ans = ans.next;
        int n1 = 0;
        while (l1 != null) {
            int temp = l1.val;
            n1 = n1 * 10 + temp;
            l1 = l1.next;
        }
        int n2 = 0;
        while (l2 != null) {
            int temp = l2.val;
            n2 = n2 * 10 + temp;
            l2 = l2.next;
        }
        int a2 = rev(n1) + rev(n2);
        int t = a2;
        int saa = a2;
        int count = 0;
        while (t != 0) {
            count++;
            t = t / 10;
        }
        int[] arr = new int[count];
        int idx = 0;
        while (a2 > 0) {
            int temp = a2 % 10;
            arr[idx] = temp;
            a2 = a2 / 10;
            idx++;
        }
        int[] arr2 = new int[count];
        int j = count;
        for (int i = 0; i < count; i++) {
            arr2[j - 1] = arr[i];
            j = j - 1;
        }
        for (int i = 0; i != count; i++) {
            ans = new ListNode(arr2[i], ans);
        }
        if (ans == null) {
            ans = new ListNode(0);
        }
        return saa;
    }

    public static int rev(int num) {
        int ans = 0;
        while (num != 0) {
            int temp = num % 10;
            ans = ans * 10 + temp;
            num = num / 10;
        }
        return ans;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while (true) {
            if (temp == null) {
                break;
            }
            count++;
            temp = temp.next;

        }
        count = count - 1;
        if (count == 0) {
            temp = head.next;
            head.next = null;
            head = null;
            return temp;
        }
        int nodeFromStart = count - n + 1;
        ListNode prev = null;
        ListNode temp2 = head;
        while (count > 0) {
            prev = temp2;
            temp2 = temp2.next;
            count--;
        }
        prev.next = temp2.next;
        temp2.next = null;
        temp2 = null;
        return head;

    }

}