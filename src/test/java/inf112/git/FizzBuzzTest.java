package inf112.git;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testLowerBoundRegularNumber() {
        final String result = fizzBuzz.compute(0);
        assertEquals("0", result);
    }

    @Test
    public void testOneReturnsOne() {
        assertEquals("1", fizzBuzz.compute(1));
    }

    @Test
    public void threeReturnsFizz() {
        assertEquals("fizz", fizzBuzz.compute(3));
    }

    @Test
    public void sixReturnsFizz() {
        assertEquals("fizz", fizzBuzz.compute(6));
    }

    @Test
    public void fiveReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.compute(5));
    }

    @Test
    public void tenReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.compute(10));
    }
}
