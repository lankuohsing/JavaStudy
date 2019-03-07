package example.powermock;

import org.powermock.api.mockito.PowerMockito;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class BussinessTest2 {
 
    private ProcessDB mockDB;
    private BussinessService bs;
    @Before
    public void setUp() throws Exception {
        mockDB = PowerMockito.mock(ProcessDB.class);
        String aa = "haha, everything is fake";
        PowerMockito.when(mockDB.getResultOfConnectDB()).thenReturn(aa);
        bs = new BussinessService(mockDB);
    }
    
    @Test
    public void mockConnectDB(){
        System.out.println(bs.testedMehtod());
        assertEquals("haha, everything is fake", bs.testedMehtod());
    }
}
/*
这样就模拟了连接数据库的过程输出，本来真实连接数据库的时候输出“haha, Really went to the database“，但是真实连接数据库来测试比较麻烦，所以现在被模拟对象取代，输出你自己造的数据"haha, everything is fake"。

不过这一切都建立在你mock的对象是你被测试对象的属性变量，而不是在测试方法内部自己new出来的ProcessDB对象。下面看方法内部new对象，使用mockito模拟对象会怎样

*/