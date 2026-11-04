package advsoft.flyweight;

import java.util.ArrayList;

public class ColorFactory {
    private ArrayList<Color> pool = new ArrayList<Color>();

    public static final ColorFactory instance = new ColorFactory();

    private ColorFactory() {}

    public Color getColor(String name) {
        for (Color c : pool) {
            if (c.getName() == name)
                return c;
        }

        Color newColor = new Color(name);
        pool.add(newColor);

        return newColor;
    }
}
