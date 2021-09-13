package sample9;

public class JenelicSample {
	public static void main(String[] args) {
		GenericcSample<String> cstr = new GenericcSample<>("Hello !!");
		String str = cstr.getValue();
		System.out.println(str);
		
		GenericcSample<Integer> cint = new GenericcSample<>(100);
		Integer inum = cint.getValue();
		System.out.println(inum);
	}
}

class GenericcSample<T> {
	private T value;
	
	public GenericcSample(T val) {
		this.value = val;
	}
	
	public T getValue() {
		return value;
	}
}
