package advsoft.flyweight;


public class RichCharacter {
    private char character;
    private Font font;
    private int size;
    private Color color;

    public RichCharacter(char character, Font font, int size, Color color) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public char getChar() {
        return character;
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
