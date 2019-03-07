package class_study_package.combination;

class Point {
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int GetX() {
		return x;
	}
	public int GetY() {
		return y;
	}
}
public class Line{
	private Point p1,p2;
	public Line(Point a,Point b) {
		// TODO Auto-generated constructor stub
		p1=new Point(a.GetX(), a.GetY());
		p2=new Point(b.GetX(), b.GetY());
	}
	public double Length() {
		return Math.sqrt(Math.pow(p2.GetX()-p1.GetX(),2)+Math.pow(p2.GetY()-p1.GetY(), 2));
	}
	public static void main(String[] args) {
		Point p1=new Point(1, 1);
		Point p2=new Point(2, 2);
		Line line1=new Line(p1, p2);
		System.out.println("length of line1: "+line1.Length());
	}
}
