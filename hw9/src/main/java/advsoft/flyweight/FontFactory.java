package advsoft.flyweight;

import java.util.NoSuchElementException;

public class FontFactory extends FlyweightFactory<Font> {
    //private ArrayList<Font> pool = new ArrayList<Font>();

    public static final FontFactory instance = new FontFactory();

    private FontFactory() {}

    public Font getFont(String name) {
        try {
            return get((Font f) -> f.getName() == name);
        }
        catch (NoSuchElementException e) {
            Font newFont = new Font(name);
            pool.add(newFont);
            return newFont;
        }
    }

    public void printPool() {
        System.out.println("===== Font Pool =====");
        for (Font f : pool) {
            System.out.println(f.getName());
        }
    }
}
