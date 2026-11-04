package advsoft.flyweight;

public class ColorFactory {
    public static final ColorFactory instance = new ColorFactory();

    private ColorFactory() {}

    public Color getColor(String name) {
        return null;
    }
}
