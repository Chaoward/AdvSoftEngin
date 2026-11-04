package advsoft.flyweight;

import java.util.ArrayList;

public class FontFactory {
    private ArrayList<Font> pool = new ArrayList<Font>();

    public static final FontFactory instance = new FontFactory();

    private FontFactory() {}

    public Font getFont(String name) {
        for (Font f : pool) {
            if (f.getName() == name)
                return f;
        }

        Font newFont = new Font(name);
        pool.add(newFont);

        return newFont;
    }
}
