package exception_example_package;

public class TestMyExeption {
	public void regist(int num) throws MyException {  
        if (num < 0) {  
            throw new MyException("����Ϊ����������!", 1);  
        }  
        System.out.println("throw ֮��ĳ�����ִ��" + num);  
    }  
  
    /** 
     * ���쳣���׳�ȥ,�������߲㴦�� 
     *  
     * @throws MyException 
     */  
    public void manager() throws MyException {  
        regist(-100);  
    }  
  
    /** 
     * ���쳣���ػ񲢴��� 
     */  
    public void manager1() {  
        try {  
            regist(-1330);  
        } catch (MyException e) {  
            // �ڴ�������ʱ��,���Ը����Լ�����Ҫȥ��ӡ�������Ϣ  
            System.out.println("������,����ı��:" + e.getIdNumber());  
        }  
        System.out.println("������Լ���ִ�У�");  
    }  
  
    public static void main(String[] args) throws MyException {  
        new TestMyExeption().manager();  
//      new TestMyExeption().manager1();  
    }  
}
