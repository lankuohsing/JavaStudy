package exception_example_package;

public class ExceptionExample0 {
	public static void main(String[] args) {
		try { 
			throw new ArithmeticException();
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(ae);
		}
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException ai) {
			// TODO: handle exception
			System.out.println(ai);
		}
		try {
			throw new StringIndexOutOfBoundsException();
		} catch (StringIndexOutOfBoundsException si) {
			// TODO: handle exception
			System.out.println(si);
		}
	}
}
