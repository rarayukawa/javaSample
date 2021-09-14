package sample9;

public class GenericSample<T> {
	private T value;
	
	public GenericSample(T val) {
		this.value = val;
	}
	
	public T getValue() {
		return value;
	}
}


