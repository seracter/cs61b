package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple1() {
        IntList lst = IntList.of(16, 17, 18, 19, 20);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("16 -> 289 -> 18 -> 361 -> 20", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(5, 6, 7, 8, 9);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("25 -> 6 -> 49 -> 8 -> 9", lst.toString());
        assertTrue(changed);
    }
}
