public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(Node head){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }
    public void deleteFrst(){
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node currN=head.next;
        Node secondN=head;
        while(currN.next!=null){
            currN=currN.next;
            secondN=secondN.next;
        }
        secondN.next=null;

    }
    public Node reverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prevN=head;
        Node currN=head.next;
        while(currN!=null){
            Node nextN=currN.next;
            currN.next=prevN;
            prevN=currN;
            currN=nextN;
        }
        head.next=null;
        head=prevN;
        return head;
    }
    public boolean isPalindrome(Node head) {
        Node head2=middleElm(head);
        head2=reverseList(head2);
//        System.out.println("head2:");
//        printList(head2);
        while(head!=null && head2!=null){
            if(head.data!=head2.data){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        return true;
    }
    public Node middleElm(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addLast("b");
        list.addLast("b");
        list.addLast("a");
//        list.addFirst("h");
        list.printList(list.head);
        System.out.println();
        boolean n=list.isPalindrome(list.head);
        System.out.println(n);
    }
}
