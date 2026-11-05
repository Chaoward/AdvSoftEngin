package advsoft.flyweight;

import java.util.NoSuchElementException;


public class ColorFactory extends FlyweightFactory<Color> {

    public static final ColorFactory instance = new ColorFactory();

    private ColorFactory() {}

    public Color getColor(String name) {
        try {
            return get((Color c) -> c.getName() == name);
        }
        catch (NoSuchElementException e) {
            Color newColor = new Color(name);
            pool.add(newColor);
            return newColor;
        }
    }

    public void printPool() {
        System.out.println("===== Color Pool =====");
        for (Color c : pool) {
            System.out.println(c.getName());
        }
    }
}
