package example.junit;
/*
 * # 11. Java单元测试
## 11.1. Junit
具体内容可参考https://www.cnblogs.com/happyzm/p/6482886.html
注意要先安装lombok（最好是最新版，1.16.4版本经测试会出现“creation of element failed index 5 size 5”bug），安装教程参考https://www.cnblogs.com/30go/p/8468981.html
 */
public class Calculator {
    private static int result; // 静态变量，用于存储运行结果
    public void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - 1;  //Bug: 正确的应该是 result =result-n
    }
    public void multiply(int n) {
    }         // 此方法尚未写好
    public void divide(int n) {
        result = result / n;
    }
    public void square(int n) {
        result = n * n;
    }
    public void squareRoot(int n) {
        for (; ;) ;            //Bug : 死循环
    }
    public void clear() {     // 将结果清零
        result = 0;
    }
    public int getResult(){
        return result;
    }
}
