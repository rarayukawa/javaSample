package sample;
import java.util.ArrayList;

public class Listsampl {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for(int i : points) {
			System.out.println(i);
		}
		ArrayList c = new ArrayList();
		c.add("hoge");
		c.add("foo");
		c.add("bar");
		
	}
}
