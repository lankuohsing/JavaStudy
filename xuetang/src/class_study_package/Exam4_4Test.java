package class_study_package;

public class Exam4_4Test {
	public static void main(String[] args) {
		A1 a1=new A1();
		a1.setx(4);
		a1.printa();//4
		
		B1 b1=new B1();
		b1.printb();//super.x=12 x= 100
		b1.printa();//12
		
		b1.setx(6);//将继承x值设置为6
		b1.printb();//super.x=16 x= 100
		b1.printa();//16
		a1.printa();//4
	}
}
