package io_example.read_keyboard;
import java.util.Scanner;
public class ScannerExample1 {
	public static void main(String [] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("���������������"); 
        String name = sc.nextLine(); 
        System.out.println("������������䣺"); 
        /*
         * 1����EnterΪ������,Ҳ����˵ nextLine()�������ص�������س�֮ǰ�������ַ���
         * 2�����Ի�ÿհס�
         */
        int age = sc.nextInt(); 
        System.out.println("��������Ĺ��ʣ�"); 
        float salary = sc.nextFloat(); 
        System.out.println("�����Ϣ���£�"); 
        System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"���ʣ�"+salary);
        sc.close();
        }
}
