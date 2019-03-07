package homework_programming;

import java.util.ArrayList;
import java.util.Scanner;

class Person{
	public ArrayList<Integer> scoreList=new ArrayList<Integer>();
	public int averageScore;
	public String type="";
	public void calAverageScore() {
		float sumScore=0;
		for (int i = 0; i < scoreList.size(); i++) {
			sumScore=sumScore+scoreList.get(i);
		}
		averageScore=(int)sumScore/scoreList.size();
	}
	
}
class Teacher extends Person{
	
}
class Student extends Person{
	
}
public class Main {
	public static void main(String[] args) {
		ArrayList<Person> personsList=new ArrayList<Person>();
		Scanner sc = new Scanner(System.in); 
		String numString = sc.nextLine().trim(); 
		int num=Integer.parseInt(numString);
		for (int i = 0; i < num; i++) {
			String inputLine=sc.nextLine().trim();
			String strArray[]=inputLine.split(" ");
			if (strArray.length==3) {
				Student student=new Student();
				for (int j = 0; j < 3; j++) {
					student.scoreList.add(Integer.parseInt(strArray[j]));
				}
				student.calAverageScore();
				student.type="Student";
				personsList.add(student);
			}
			if (strArray.length==4) {
				Teacher teacher=new Teacher();
				for (int j = 0; j < 4; j++) {
					teacher.scoreList.add( Integer.parseInt(strArray[j]));
				}
				teacher.calAverageScore();
				teacher.type="Teacher";
				personsList.add(teacher);
			}
			
		}
		for (int i = 0; i < personsList.size(); i++) {
			if (personsList.get(i).type.equals("Student")) {
				System.out.println("Student "+personsList.get(i).averageScore);
			}
			if (personsList.get(i).type.equals("Teacher")) {
				System.out.println("Teacher "+personsList.get(i).averageScore);
			}
		}
		
	}
	
}
