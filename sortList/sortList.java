package sortList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import MergeTwoSortedLists.MergeTwoSortedLists.ListNode;

public class sortList {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        a.next = new ListNode(2);
        a.next.next = new ListNode(1);
        System.out.println(Arrays.toString(sortList1(a)));
    }

    public static ListNode sortList1(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode ans = new ListNode(0);
        ListNode currentNode = ans;
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int[] arr = new int[length];
        for (int i = 0; i != length; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        Arrays.sort(arr);
        for (int val : arr) {
            currentNode.next = new ListNode(val);
            currentNode = currentNode.next;
        }
        return ans.next;

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

}
