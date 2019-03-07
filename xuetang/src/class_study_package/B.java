package class_study_package;

public class B extends A{
	int x=100;
	void printb(){
		super.x=super.x+10;
		System.out.println("super.x="+super.x+" x= "+x);
	}
}

