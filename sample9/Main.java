package sample9;

public class Main {
	public static void main(String[] args) {
		GenericSample<String> cstr = new GenericSample<String>("Helloポテパン!");
		String str = cstr.getValue();
		System.out.println(str);
		
		GenericSample<Integer> cint = new GenericSample<Integer>(100);
		Integer inum = cint.getValue();
		System.out.println(inum);
	}
}
