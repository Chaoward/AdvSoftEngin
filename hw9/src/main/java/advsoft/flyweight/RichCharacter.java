package advsoft.flyweight;


public class RichCharacter {
    private Font font;
    private int size;
    private Color color;

    public RichCharacter(Font font, int size, Color color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public Font getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }
}
