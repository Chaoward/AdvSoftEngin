import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import advsoft.flyweight.Font;
import advsoft.flyweight.FontFactory;
import advsoft.flyweight.RichCharacter;

public class FlyweightTest {

    @Test
    public void testFont() {
        FontFactory fontFac = FontFactory.instance;
        Font trgt = fontFac.getFont("Comic Sans");
        Font difFont = new Font("Comic Sans");

        assertEquals(trgt, fontFac.getFont("Comic Sans"));
        assertNotEquals(trgt, difFont);
        assertNotEquals(trgt, fontFac.getFont("Arial"));

        trgt = fontFac.getFont("Arial");
        difFont = new Font("Arial");
        assertEquals(trgt, fontFac.getFont("Arial"));
        assertNotEquals(trgt, difFont);
        assertNotEquals(trgt, fontFac.getFont("Comic Sans"));
    }

}
