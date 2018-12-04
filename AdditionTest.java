package GroupeTP1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void sommeAB() {
        Addition sum = new Addition(12,5);
        assertEquals(sum.SommeAB(),17);
    }
}