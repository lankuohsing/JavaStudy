package exception_example_package;
import java.util.Scanner; 
public class TestThrow {
	public static void main(String[] args) {  
        TestThrow t = new TestThrow();  
        System.out.print("�������������䣺");  
        System.out.println("�������䣺" + t.inputAge());  
    }  
  
    public int inputAge() {  
        int result = -1;  
        Scanner scan = new Scanner(System.in);  
        while (true) {  
            try {  
                result = scan.nextInt();  
                if (result < 0 || result > 130) {  
                    Exception me = new Exception("���䳬��������Χ��");  
                    throw me;  
                }  
                break;  
            } catch (Exception e1) {  
                System.out.print(e1.getMessage() + "���������룺");  
                continue;  
            }  
        }  
        return result;  
    } 
}