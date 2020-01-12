package io_example.read_keyboard;


import java.util.Scanner;

/*
 * nextLine方式接收：
 * hello world 2018
 * 输入的数据为：hello world 2018
 */
public class hasNextLineExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 从键盘接收数据
        // next方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (s.hasNextLine()) {
            String str2 = s.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        s.close();
    }
/*
 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符；
 2、可以获得空白，都会读入，空格等均会被识别；
*/
}
