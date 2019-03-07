package exception_example_package;
/*
 * https://www.cnblogs.com/ECJTUACM-873284962/p/7527052.html
 */
public class ExceptionExample2 {
	static void procedure() {
        try {
            int a = 0;
            int b = 42/a;
        } catch(java.lang.ArithmeticException e) {
            System.out.println("in procedure, catch ArithmeticException: " + e);
            throw e;//
        }
    }
    public static void main(String args[]) {
        try {
            procedure();
        } catch(java.lang. Exception e) {
            System.out.println("in main, catch Exception: " + e);
        }
    }
}
