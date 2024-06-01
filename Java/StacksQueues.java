import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class StacksQueues {
    // Abstract Data type -  push, pop
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(54);
        stack.push(5);  
        stack.push(65);
        stack.push(98);
        stack.push(32);
        stack.push(48);     

        // System.out.println(stack.search(65));
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); 


        // Abstract Data type - enqueue(add function)- inbuilt method is offer, dequeue(remove function)inbuilt method is poll
        // Time complexitiy - O(1)
        // Applications - omline booking sys, google drive trash delete photo t hat has come first
        Queue<Integer> queue = new LinkedList<>();
        queue.add(59);
        queue.add(46);
        queue.add(72);
        queue.add(16);
        queue.add(36);
        queue.add(87);

        // difference between pull and remove function is that when remove is used and queue or stack is empty it throws exception in pull it returns null  

        // System.out.println(queue.peek());  //doesnt remove the item just gets element
        // System.out.println(queue.remove());
        // System.out.println(queue.peek());


        // Deque is a ds that gives us flexibility here we can add element from first or last and remove frmo both sides as well. it can act as both stack and queue
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast (78);
        deque.removeFirst();
    }
}