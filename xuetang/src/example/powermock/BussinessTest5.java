package example.powermock;

/*
 * 5、仿照上面解决3中的问题，内部直接使用new对象而不是通过静态方法getInstance()
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
 
@RunWith(PowerMockRunner.class)  
@PrepareForTest(ProcessDB.class) 
public class BussinessTest5 {
 
    private ProcessDB mockDB;
    private BussinessService5 bs;
    
    
    @Test
    public void mockConnectDB(){
        mockDB = PowerMockito.mock(ProcessDB.class);  
        bs = new BussinessService5();  
        try {
            PowerMockito.whenNew(ProcessDB.class).withNoArguments().thenReturn(mockDB);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        String aa = "haha, everything is fake";
        PowerMockito.when(mockDB.getResultOfConnectDB()).thenReturn(aa);
        System.out.println(bs.testedMehtod());
        assertEquals("haha, everything is fake", bs.testedMehtod());
    }
}

/*
这样看似与4相似，但是结果测试又通不过，输出的又是"haha, Really went to the database"，加上PowerMockito.mockStatic(ProcessDB.class)也不管用。
*/