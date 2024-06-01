public class DLL {
    Node head;

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if (head.prev!=null){
            head.prev=node;
        }
        head = node;

    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int value){
            this.val = value;
        }

        public Node (int value, Node next, Node prev){
            this.val= value;
            this.next= next;
            this.prev=prev;
        }




    }
}
