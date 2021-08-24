package sample;

public class Area implements Circle {
	public String calc(double r) {
		double area = Math.PI * r * r;
		return "面積:" + area;
	}
}
