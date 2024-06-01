

public class FloydsCycleDetection{

    //also called hare and tortoise pointers
    // used to detect cycle in linked list
    // at any point if fast and slow pointer point to same place then loop is detected
    
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = 0;
            this.next = null; 
        }
    }

    private static Node head;



    public static void main(String[] args) {
        
    Node fast = head;
    Node slow = head;
    int flag = 0;
        while (slow!=null || fast!=null || fast.next!=null) {
            if (fast==slow) {
                flag=1;
                break;
            }
        }

        if(flag==1){
            System.out.println("loop detected");
        }
        else{
            System.out.println("no loop detected    ");
        }
    }
}