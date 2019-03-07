package class_study_package.interface_example;

interface Color{
	void setColor(String str);
}
class Circle1 implements Shape2D,Color{
	double radius;
	String color;
	public  Circle1(double r) {
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


public class MultiInterfaceTester {
	public static void main(String[] args) {
		Circle1 cir;
		cir=new Circle1(2.0);
		cir.setColor("blue");
		System.out.println("Area= "+cir.area());
	}
}
