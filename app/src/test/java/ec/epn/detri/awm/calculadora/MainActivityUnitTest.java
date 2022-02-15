package ec.epn.detri.awm.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityUnitTest {

    @Test
    public void suma_isCorrect() {
        assertEquals(4, MainActivity.suma(2,2),0);
    }

    @Test
    public void division_isCorrect() {
        assertEquals(0, MainActivity.division(2,0),0);
    }
}