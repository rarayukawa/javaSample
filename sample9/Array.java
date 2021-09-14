package sample9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Array {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();
		queue.add("sa");
		queue.add("mu");
		queue.add("ra");
		queue.add("i");
		
		
		System.out.println(queue.peek());
		System.out.println(queue);
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.push("sa");
		deque.push("mu");
		deque.push("ra");
		deque.push("i");
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque);
		System.out.println(deque.peek());
		System.out.println(deque);
	}
}
