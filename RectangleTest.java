package GroupeTP1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getAire() {
        Rectangle rect = new Rectangle(5,3);
        assertEquals(rect.getAire(),15,0);
    }
}