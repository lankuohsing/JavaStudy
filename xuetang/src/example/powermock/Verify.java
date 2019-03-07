package example.powermock;
/*
 * 7、流程测试的最后一步是外部依赖时的验证（例如发送到kafka等）
 */
import java.util.LinkedList;

public class Verify {
 
    private LinkedList k ;
    public Verify(LinkedList k){
        this.k = k;
    }
    
    public void test(){
        k.add("d");
        k.add("b");
        System.out.println(k.get(0));
    }
}
