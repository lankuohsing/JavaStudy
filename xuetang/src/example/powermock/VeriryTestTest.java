package example.powermock;


import java.util.LinkedList;
import static org.mockito.Mockito.*;
import org.junit.Test;
 
public class VeriryTestTest {
    @Test
    public void testt(){
     LinkedList mockedList = mock(LinkedList.class);
     when(mockedList.get(anyInt())).thenReturn("first");
     new Verify(mockedList).test();
     verify(mockedList).get(anyInt());
 
    }
}
