//import java.util.Stack;

// Implement Queue using two stacks
class Queue1<T> {
	private Stack<T> s1, s2;

	// Constructor
	Queue1() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	// Enqueue an item to the queue
	public void enqueue(T data) {
		// Move all elements from the first stack to the second stack
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		// Push item into the first stack
		s1.push(data);

		// Move all elements back to the first stack from second stack
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}

	// Dequeue an item from the queue
	public T dequeue() {
		// if first stack is empty
		if (s1.isEmpty()) {
			System.out.println("Underflow!!");
			System.exit(0);
		}

		// return the top item from the first stack
		return s1.pop();
	}
}

/*class Main
{
	public static void main(String[] args) {
		int[] keys = { 1, 2, 3, 4, 5 };
		Queue q = new Queue();

		// insert above keys
		for (int key : keys) {
			q.enqueue(key);
		}

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}*/
