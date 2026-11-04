package advsoft;

import advsoft.flyweight.FileReading;
import advsoft.flyweight.RichCharacter;

public class Main {
    public static void main(String[] args) {
        flyweight();
    }


    public static void flyweight() {
        RichCharacter[] text;
        try {
            text = FileReading.readFile("./file.txt");
            printChars(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void printChars(RichCharacter[] characters) {
        for (RichCharacter c : characters) {
            System.out.print(c.getChar());
        }
        System.out.println();

        for (RichCharacter c : characters) {
            System.out.println(c.getChar() + "|" + c.getFont() + "|" + c.getSize() + "|" + c.getColor());
        }
    }
}