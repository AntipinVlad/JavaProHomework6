public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));

        ListNode i = head.reverseList(head);
        while(i != null) {
            System.out.print(i.val + " ");
            i = i.next;
        }
    }
}