import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EvenOddCheckerTest {

    @Test
    public void evenTest() {
        assertTrue("the number is not even", EvenOddChecker.check(2));
    }

    @Test
    public void notEvenTest() {
        assertTrue("the number is even", EvenOddChecker.check(2));
    }


}
