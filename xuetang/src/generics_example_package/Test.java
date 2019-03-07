package generics_example_package;

public class Test {
	public static void main(String[] args) {
		GeneralType<Integer> i=new GeneralType<Integer>(2);
		GeneralType<Double> d=new GeneralType<Double>(0.33);
		System.out.println("i.object="+(Integer)i.getObj());
		//System.out.println("i.object="+(Integer)d.getObj());//compile error
		GeneralMethod gm=new GeneralMethod();
		gm.printClassName("hello");
		gm.printClassName(3);
		gm.printClassName(3.0f);
		gm.printClassName(3.0);
		ShowType st=new ShowType();
		GeneralType<Integer> i1=new GeneralType<Integer>(2);
		GeneralType<String> s=new GeneralType<String>("hello");
		st.show(i1);
		st.show(s);
	}
}
