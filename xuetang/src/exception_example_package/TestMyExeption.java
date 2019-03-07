package exception_example_package;

public class TestMyExeption {
	public void regist(int num) throws MyException {  
        if (num < 0) {  
            throw new MyException("人数为负数不合理!", 1);  
        }  
        System.out.println("throw 之后的程序不能执行" + num);  
    }  
  
    /** 
     * 把异常给抛出去,交给更高层处理 
     *  
     * @throws MyException 
     */  
    public void manager() throws MyException {  
        regist(-100);  
    }  
  
    /** 
     * 把异常给截获并处理 
     */  
    public void manager1() {  
        try {  
            regist(-1330);  
        } catch (MyException e) {  
            // 在处理错误的时候,可以根据自己的需要去打印错误的信息  
            System.out.println("出错了,错误的编号:" + e.getIdNumber());  
        }  
        System.out.println("程序可以继续执行！");  
    }  
  
    public static void main(String[] args) throws MyException {  
        new TestMyExeption().manager();  
//      new TestMyExeption().manager1();  
    }  
}
