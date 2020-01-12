
package io_example.read_keyboard;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的姓名：");
        //String name = sc.nextLine();//会跳过输入姓名的环境，以为nextLine会把上次的回车键读进去
        /*
         * next()用法
         * 1、一定要读取到有效字符后才可以结束输入。
         * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
         * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
         * next()不能得到带有空格的字符串
         */
        String name = sc.next();
        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary);
        sc.close();
        }
}