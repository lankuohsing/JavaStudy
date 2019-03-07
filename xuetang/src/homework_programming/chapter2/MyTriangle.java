package homework_programming.chapter2;
import java.util.Scanner;
public class MyTriangle {
	double a,b,c;
	public MyTriangle(double initA,double initB,double initC){
		double maxEdge=initB>initC?initB:initC;
		maxEdge=maxEdge>initA?maxEdge:initA;
		double minEdge=initB<initC?initB:initC;
		minEdge=minEdge<initA?minEdge:initA;
		if (maxEdge<=0) {
			a=0;
			b=0;
			c=0;
		}
		else{
			if (minEdge>0) {
				if (initA+initB>initC&&initA+initC>initB&&initB+initC>initA) {
					a=initA;
					b=initB;
					c=initC;
				}
				else{
					a=maxEdge;
					b=a;
					c=a;
				}
			}
			else{
				a=maxEdge;
				b=a;
				c=a;
			}
		}
	}
	public double getArea() {
		double p=(a+b+c)/2;
		double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double initA=sc.nextDouble();
		double initB=sc.nextDouble();
		double initC=sc.nextDouble();
		sc.close();
		MyTriangle triangle1=new MyTriangle(initA, initB, initC);
		System.out.println(triangle1.getArea());
	}
}
