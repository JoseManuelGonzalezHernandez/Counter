import static org.junit.Assert.*;
import org.junit.Test;

public class counterTest {
    @Test
    public void testCreate() {
        
        Counter counter = new Counter(0, 1, 10);

        int [] valExpected = {0 , 1 , 10};

        assertEquals(valExpected, counter.getVals());
    }

    public void testCreateWithDefaultValue() {
        
        Counter counter = new Counter(10);

        int [] valExpected = {0 , 1 , 10};

        assertEquals(valExpected, counter.getVals());
    }

    public void testValueCounter() {
        Counter counter = new Counter(10);

        assertEquals(0,counter.counter);

        System.out.println(counter.counter);
        counter.doCounter();
        System.out.println(counter.counter);

        assertEquals(1,counter.counter);

        counter.resetCounter();
        

        Counter counter2 = new Counter(1, 2, 20);

        assertEquals(1,counter2.counter);

        System.out.println(counter2.counter);
        counter.doCounter();
        System.out.println(counter2.counter);

        assertEquals(3,counter2.counter);

        counter2.resetCounter();

    }
}
