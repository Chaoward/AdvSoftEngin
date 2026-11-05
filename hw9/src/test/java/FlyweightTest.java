import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import advsoft.flyweight.Color;
import advsoft.flyweight.ColorFactory;
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

        fontFac.printPool();
    }

    @Test
    public void testColor() {
        ColorFactory colorFac = ColorFactory.instance;
        Color trgt = colorFac.getColor("Red");
        Color difColor = new Color("Red");

        assertEquals(trgt, colorFac.getColor("Red"));
        assertNotEquals(trgt, difColor);
        assertNotEquals(trgt, colorFac.getColor("Blue"));

        trgt = colorFac.getColor("Blue");
        difColor = new Color("Blue");
        assertEquals(trgt, colorFac.getColor("Blue"));
        assertNotEquals(trgt, difColor);
        assertNotEquals(trgt, colorFac.getColor("Red"));

        colorFac.printPool();
    }


    @Test 
    public void testSize() {
        //SizeFactory sizeFac = SizeFactory.getInstance();
        //Size trgt = SizeFactory.getSize(12);
    }
}
