import org.junit.Test;

import static org.junit.Assert.*;

public class TestArrTest {
    TestArr Ta = new TestArr();
    int sum = Ta.add(3,5);
    int TestSum = 8;
    TestArr Da = null;
    @Test(timeout = 1)
    public void add() throws Exception {
        System.out.println("@Test sum():" + sum + "=" +TestSum);
        assertEquals(sum,TestSum);
        assertNotNull(Ta);
        assertTrue(sum == TestSum);

    }

}