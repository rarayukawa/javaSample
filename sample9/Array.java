package sample9;

import java.util.ArrayDeque;
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
	}
}
