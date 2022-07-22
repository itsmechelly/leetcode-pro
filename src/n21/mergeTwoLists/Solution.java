package n21.mergeTwoLists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Define new NodeList to return
        ListNode answer = new ListNode();
        ListNode newNode = answer;

        //If list1 has no element then add list2 to new node
        if (list1 == null) {
            return newNode.next = list2;
        }

        //If list2 has no element then add list1 to new node
        if (list2 == null) {
            return newNode.next = list1;
        }

        //Use Merge sort logic to merge nodes value
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newNode.next = list1;
                list1 = list1.next;
            } else {
                newNode.next = list2;
                list2 = list2.next;
            }
            newNode = newNode.next;
        }

        //If any node left in list1
        if (list1 != null) {
            newNode.next = list1;
        }

        //If any node left in list2
        if (list2 != null) {
            newNode.next = list2;
        }

        return answer.next;
    }

    public String toString(ListNode listNode) {
        String result = "";
        while (listNode != null) {
            result += listNode.val + " ";
            listNode = listNode.next;
        }
        return result;
    }
}
