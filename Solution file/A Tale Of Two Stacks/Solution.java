import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

    // Push onto newest stack

        public void enqueue(T value) { 
            stackNewestOnTop.push(value);
        }
        //Call method to rerange order so we know the second stack is following FIFO order. After that, we then retrieve the value at the top of the second stack which would then be the value at the front of the queue
        
        public T peek() {
            rerangeOrder();
            return stackOldestOnTop.peek();
        }
        // Call method to rerange order so we know the second stack is following FIFO order. After that, we can then remove the TOS value in second stack which is like removing the front queue value
        public T dequeue() {
            rerangeOrder();
            return stackOldestOnTop.pop();
        }

//pop values from first stack (stackNewestOnTop) and push onto the second stack (stackOldestOnTop) so it goes from a LIFO to FIFO order (like a queue).
        public void rerangeOrder(){
            if(stackOldestOnTop.isEmpty()){
                while(!stackNewestOnTop.isEmpty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

    }