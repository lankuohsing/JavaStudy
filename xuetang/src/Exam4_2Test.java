
import java.util.ArrayList;

import class_study_package.Manager;

public class Exam4_2Test {
	public static void main(String[] args) {
		String a="lan";
		
		ArrayList<String> list = new ArrayList<String>();
		// ����Ԫ�ص�list������
		list.add("languoxing");
		list.add("Item2");
		list.add(2, "Item3"); // ������佫��ѡ�Item3���ַ������ӵ�list�ĵ�3��λ�á�
		list.add("Item4");
		if(a==list.get(0).substring(0, 3))System.out.println("bingo");
		// ��ʾ���������е�����
		//System.out.println("The arraylist contains the following elements: "
		//+ list);
		//System.out.println(list.get(0));
	}
}
