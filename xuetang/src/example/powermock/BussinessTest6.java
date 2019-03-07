package example.powermock;

/*
 * 6、真正解决3中的new对象的问题
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
 
@RunWith(PowerMockRunner.class)  
@PrepareForTest({ProcessDB.class, BussinessService6.class}) 
public class BussinessTest6 {
 
    private ProcessDB mockDB;
    private BussinessService6 bs;
    
    
    @Test
    public void mockConnectDB(){
        mockDB = PowerMockito.mock(ProcessDB.class);  
        bs = new BussinessService6();  
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
 * 其实5已经基本上实现了，经过一段时间的排查，原来问题是出在头顶上的两个注解上
 */

