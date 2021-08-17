package sample;

public class Dog {
	private static int counter;
	private String name;
	private int cryCount;
	
	public Dog(String name) {
		this(name, 1);
	}
	
	public Dog(String name, int cryCount) {
		this.setName(name);
		this.setCryCount(cryCount);
		
		Dog.counter++;
		System.out.println(Dog.counter + "個目のインスタンスが生成されました");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCryCount(int cryCount) {
		this.cryCount = cryCount;
	}
	
	public void cry() {
		System.out.print(this.name + "「");
		for(int i = 0; i < this.cryCount; i++) {
			System.out.print("ワン");
		}
		System.out.println("」");
	}
	
	public void sitDown() {
		System.out.println(this.name + "は座りました");
	}
}
