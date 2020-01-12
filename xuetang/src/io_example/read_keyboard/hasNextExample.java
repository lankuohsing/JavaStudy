package io_example.read_keyboard;

import java.util.Scanner;

/*
 * next方式接收：
 * hello world
 * 输入的数据为：hello
 */
public class hasNextExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 从键盘接收数据
        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (s.hasNext()) {
            String str1 = s.next();
            System.out.println("输入的数据为：" + str1);
        }
        s.close();
    }
/*
 1、一定要读取到有效字符后才可以结束输入。
 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
 next() 不能得到带有空格的字符串。
 */
}
