package homework_programming.chapter1;
import java.util.Scanner;
public class Fibonacci {
	public static long  Fib(long  N) {
		if(N==0||N==1) {
			return 1;
		}
		else {
			long  Fib_N1=1;
			long  Fib_N2=1;
			long  Fib_N=0;
			for(long  i=2;i<=N;i++) {
				Fib_N=Fib_N1+Fib_N2;
				Fib_N1=Fib_N2;
				Fib_N2=Fib_N;
			}
			return Fib_N;
		}
	}
	public static void main(String[] args) {
		long  N;
		Scanner sc = new Scanner(System.in); 
		N=sc.nextInt();
		sc.close();
		System.out.println(Fib(N));
		
	}
}
