package homework_programming.chapter2;
import java.util.Scanner;
public class Rectangle {
	int height;
	int width;
	public int getArea() {
		return height*width;
	}
	public int getPerimeter() {
		return 2*(height+width);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Rectangle rectangle=new Rectangle();
		rectangle.height=sc.nextInt();
		rectangle.width=sc.nextInt();
		sc.close();
		int aera=rectangle.getArea();
		int perimeter=rectangle.getPerimeter();
		System.out.println(aera+" "+perimeter);
	}
}
