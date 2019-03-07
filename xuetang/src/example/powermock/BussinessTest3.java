package example.powermock;
/*
 * 3、mockito模拟方法内部new的对象（失败）
 */

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class BussinessTest3 {
 
    private ProcessDB mockDB;
    private BussinessService3 bs;
    @Before
    public void setUp() throws Exception {
        mockDB = mock(ProcessDB.class);
        String aa = "haha, everything is fake";
        when(mockDB.getResultOfConnectDB()).thenReturn(aa);
        bs = new BussinessService3();
    }
    
    @Test
    public void mockConnectDB(){
        System.out.println(bs.testedMehtod());
        assertEquals("haha, everything is fake", bs.testedMehtod());
    }
}
/*
测试失败：
*/