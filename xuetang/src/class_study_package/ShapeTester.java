package class_study_package;

public class ShapeTester {
	public static void main(String[] args) {
		/*Circle x;
		x=new Circle();
		Rectangle y;
		y=new Rectangle();
		System.out.println(x.PI);
		System.out.println(Circle.PI);
		//Circle.PI=3.14;
		x.PI=3.14;
		System.out.println(x.PI);
		System.out.println(Circle.PI);*/
		Circle c1=new Circle();
		c1.radius=8;
		Circle c2=new Circle();
		c2.radius=15;
		Rectangle r=new Rectangle();
		r.width=20;
		r.height=30;
		System.out.println("Circle 1 fits inside Rectangle:"+c1.fitInside(r));
		System.out.println("Circle 2 fits inside Rectangle:"+c2.fitInside(r));
	}
}
