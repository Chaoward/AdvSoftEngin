package advsoft.flyweight;


public class RichCharacter {
    private char character;
    private Font font;
    private Size size;
    private Color color;

    public RichCharacter(char character, Font font, Size size, Color color) {
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

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
}
