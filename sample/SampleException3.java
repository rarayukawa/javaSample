package sample;

public class SampleException3 {
	public int div(int a, int b) throws ArithmeticException{
		int res = 0;
		try {
			if(a == 0) {
				throw new MyTestException();
			}
			res = a / b;
		} catch(MyTestException e) {
			System.out.println("0を割ろうとしているため、0を返します。 at div(");
			return 0;
		} catch(ArithmeticException e) {
			System.out.println("0を割ろうとしているため、0を返します。 at div(");
			return 0;
		}
		return res;
	}
}
