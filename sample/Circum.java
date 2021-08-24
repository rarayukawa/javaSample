package sample;

public class Circum implements Circle {
	public String calc(double r) {
		double circum = 2.0 * Math.PI *r;
		return "円周:" + circum;
	}

}
