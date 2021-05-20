import static org.junit.Assert.*;
import org.junit.Test;

public class counterTest {
    @Test
    public void testCreate() {
        
        Counter counter = new Counter(0, 1, 10);

        int [] valExpected = {0 , 1 , 10};

        assertEquals(valExpected, counter.getVals());
    }
}
