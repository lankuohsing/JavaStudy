package generics_example_package;

import com.sun.glass.ui.CommonDialogs.Type;

public class GeneralMethod {
	<Type>void printClassName(Type object){
		System.out.println(object.getClass().getName());
	}
}
