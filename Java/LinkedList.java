
public class LinkedList {
    private Node head;
    private Node tail;  
    int size;
    Node next;

    public LinkedList(int size) {
        this.size = 0;
        this.next = null;
    }

    public void InsertFirst(int val) {
        Node first = new Node(val);
        first.next = head;
        head = first;

        if (tail == null) {
            tail = head; // if our list is empty then we need to add element and then put that as tail
        }
        size += 1;
    }

    public void InsertLast(int val) {
        if (tail == null) {
            InsertFirst(val);
            return;
        }
        Node last = new Node(val);
        tail.next = last;
        tail = last;
        size++;
    }

    public void Insert(int val, int index) {
        if (head == null) {
            InsertFirst(val);
        }
        if (tail == null) {
            InsertLast(val);

        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node any = new Node(val, temp.next);
        temp.next = any;
        size++;

    }

    public Node getnode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int DeleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int DeleteLast() {
        if (size <= 1) {
            return DeleteFirst();
        }
        Node secondlast = getnode(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int Delete(int index){
        if(size == 0){
            return DeleteFirst();
        }
        if(size == index-1){
            return DeleteLast();
        }
        Node node = getnode(index-1);
        int val = node.next.value;
        node.next = node.next.next;
        return val;
    }

    public Node findvalue(int value){
        Node node = head;   // as a general rule if we want to iterate in linked list most often we point temp var to head.
        while (node!=null) {
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
       return null;
    }

    public void Display() {
        Node temp = head; // we are creating new temp var bcoz if we jusst change head then by the end
                          // head will point to null and hence structure if list will be changed.

        // structure of list can be changed only if we are adding or deleting any
        // element
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }

      public  void reverseIterative(){
            Node curr = head;
            Node nextPtr = null;
            Node prev = null;

            while(curr!=null){
                nextPtr = curr.next;
                curr.next = prev;
                prev = curr;
                curr=nextPtr;
            }
            head = prev;
            return;
        }

        public void reverseRecuresive(){
            
        }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(6);
        list.InsertFirst(5);
        list.InsertLast(99);
        list.InsertFirst(22);
        list.InsertFirst(65);
        list.InsertFirst(25);
        list.Insert(100, 3);
        // list.DeleteFirst();
        // list.DeleteLast();
        // list.Delete(3);
       list.reverseIterative();
        list.Display();
    }
}
