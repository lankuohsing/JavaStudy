package class_study_package.interface_example;
interface Shape{
	final double pi=3.14;
	public abstract void setColor(String str);
}
interface Shape2D2 extends Shape{
	
	public abstract double area();
}
class Circle2 implements Shape2D2,Color{
	double radius;
	String color;
	public  Circle2(double r) {
		radius=r;
	}
	public double area() {
		return (pi*radius*radius);
	}
	public void setColor(String str ) {
		color=str;
		System.err.println("Color= "+color);
	}
	
}
public class ExtendsInterfaceTester {
	public static void main(String[] args) {
		Circle2 cir;
		cir=new Circle2(2.0);
		cir.setColor("blue");
		System.out.println("Area= "+cir.area());
	}
}
