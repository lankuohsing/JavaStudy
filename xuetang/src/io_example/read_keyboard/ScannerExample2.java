package io_example.read_keyboard;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String [] args) { 
		Scanner sc = new Scanner(System.in); 
        System.out.println("������������䣺"); 
        int age = sc.nextInt(); 
        System.out.println("���������������"); 
        //String name = sc.nextLine();//���������������Ļ�������ΪnextLine����ϴεĻس�������ȥ 
        /*
         * next()�÷�
         * 1��һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������롣
         * 2����������Ч�ַ�֮ǰ�����Ŀհף�next() �������Զ�����ȥ����
         * 3��ֻ��������Ч�ַ���Ž����������Ŀհ���Ϊ�ָ������߽�������
         * next()���ܵõ����пո���ַ���
         */
        String name = sc.next();
        System.out.println("��������Ĺ��ʣ�"); 
        float salary = sc.nextFloat(); 
        System.out.println("�����Ϣ���£�"); 
        System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"���ʣ�"+salary); 
        sc.close();
}
}
