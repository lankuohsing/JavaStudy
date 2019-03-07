package example.powermock;

/*
 * 4、PowerMockito模拟方法内部创建出来的对象
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
 
@RunWith(PowerMockRunner.class)  
@PrepareForTest(ProcessDB4.class) 
public class BussinessTest4 {
 
    private ProcessDB4 mockDB;
    private BussinessService4 bs;
    
    
    @Test
    public void mockConnectDB(){
        PowerMockito.mockStatic(ProcessDB4.class);
        mockDB = PowerMockito.mock(ProcessDB4.class);  
        bs = new BussinessService4();  
        PowerMockito.when(ProcessDB4.getInstance()).thenReturn(mockDB); 
        String aa = "haha, everything is fake";
        PowerMockito.when(mockDB.getResultOfConnectDB()).thenReturn(aa);
        System.out.println(bs.testedMehtod());
        assertEquals("haha, everything is fake", bs.testedMehtod());
    }
}
/*
这样又可以测试通过，模拟了连接数据库的过程，特别注意头顶的两个注解，@RunWith(PowerMockRunner.class)  

@PrepareForTest(ProcessDB.class) 。分两步：第一步模拟出假对象PowerMockito.when(ProcessDB.getInstance()).thenReturn(mockDB); ，第二步模拟假对象调用的方法PowerMockito.when(mockDB.getResultOfConnectDB()).thenReturn(aa);

*/