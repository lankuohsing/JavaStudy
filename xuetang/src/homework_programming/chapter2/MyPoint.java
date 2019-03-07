package homework_programming.chapter2;
import java.util.Scanner;
public class MyPoint {
	private double x;
	private double y;
	public MyPoint(){
		this(0,0);
	}
	public MyPoint(double initX,double initY){
		x=initX;
		y=initY;
	}
	public double getD(MyPoint point) {
		return Math.sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		sc.close();
		MyPoint point1=new MyPoint(x1,y1);
		MyPoint point2=new MyPoint(x2,y2);
		System.out.println(point1.getD(point2));
		
	}
}
