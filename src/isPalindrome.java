import java.util.*;
public class isPalindrome {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("a");
//        printList(list.head);
//        list.head=reverseList(list.head);
    }
//    static void printList(Node head){
//        Node curr=head;
//        while(curr!=null){
//            System.out.print(curr.val+"->");
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//    public Node reverseList(ListNode head){
//        if(head==null || head.next==null){
//            return head;
//        }
//        ListNode prev=null;
//        ListNode curr=head;
//        while(curr.next!=null){
//            ListNode nextN=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=nextN;
//            nextN=curr.next;
//        }
//        return prev;
//    }
//    public boolean isPalindrome(Node head) {
//        ListNode head2=middleElm(head);
//        head2=reverseList(head2);
//        while(head!=null && head2!=null){
//            if(head.val!=head2.val){
//                return false;
//            }
//        }
//        return true;
//    }
//    public ListNode middleElm(ListNode head){
//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }

}
