import java.util.*;

public class MyQueue<T> {
	Stack<T> stack1;
	Stack<T> stack2;
 
	public MyQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();

	}

	public void enQueue(T data) {
		stack1.push(data);
	}

	private void shiftStacks() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
	}

	public T dequeue() {
		shiftStacks();
		T value = stack2.pop();
		return value;
	}

	public T peek() {
		shiftStacks();
		return stack2.peek();
	}
	
	public static void main(String[] args) {

		MyQueue<Integer> queue = new MyQueue<>();
		queue.enQueue(10);
		queue.enQueue(20);
		System.out.println(queue.peek());

	}
}