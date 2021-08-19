package sample;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name = name;
	}
	
	public void setName(String name) {
		if(name.length() < 3) {
			throw new IllegalArgumentException("名前は３文字以上にしてください");
		}
		this.name = name;
	}
	public double getPower() {
		return this.power = power;
	}
	
	public void setPower(double power) {
		if(power < 0.5 && power >100) {
			throw new IllegalArgumentException("増幅率は0.5~100以下にしてください");
		}
		this.power = power;
	}

}
