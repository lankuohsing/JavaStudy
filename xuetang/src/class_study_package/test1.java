package class_study_package;
enum Season{
	chun,xia,qiu,dong,
}
public class test1 {
	public static void main(String[] args) {
		for(Season c:Season.values())
			System.out.println(c+",");
		System.out.println(",");
	}
}
