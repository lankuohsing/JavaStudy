package example.powermock;
import org.junit.Assert;
import org.junit.Test;
/*
 * 1、简单单元测试
 * https://blog.csdn.net/ccityzh/article/details/80139807?utm_source=blogxgwz0
 */
public class BussinessTest1 {
    @Test
    public void testFuction(){
        ProcessDB db = new ProcessDB();
        BussinessService bs = new BussinessService(db);
        System.out.println(bs.testedMehtod());
        Assert.assertEquals("haha, Really went to the database", bs.testedMehtod());
    }

}
/*
正常的一个单元测试，测试一下正常流程，对结果进行断言。
*/