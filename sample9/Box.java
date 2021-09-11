package sample9;

public class Box<T> {
	T o;
	
	public Box(T o) {
		this.o = o;
	}
	
	public T get() {
		return o;
	}
	
	public static void main(String[] args) {
		Box<Integer> b = new Box(new Integer(123));
		Integer i = b.get();
		System.out.println(i);
	}
}
