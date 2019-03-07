package class_study_package;

public class Tester {
	public static void main(String[] args) {
		A a1=new A();
		a1.setx(4);
		a1.printa();//4
		
		B b1=new B();
		b1.printb();//super.x=14 x= 100
		b1.printa();//14
		
		b1.setx(6);//将继承x值设置为6
		b1.printb();//super.x=16 x= 100
		b1.printa();//16
		a1.printa();//16
	}
}
