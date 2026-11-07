package advsoft;

import advsoft.flyweight.ColorFactory;
import advsoft.flyweight.FileReading;
import advsoft.flyweight.FontFactory;
import advsoft.flyweight.RichCharacter;
import advsoft.flyweight.SizeFactory;
import advsoft.proxy.MusicService;
import advsoft.proxy.ProxyMusicService;
import advsoft.proxy.Song;

public class Main {
    public static final String PATH = "./file.txt";
    public static final String COPY_PATH = "./copy.txt";

    public static void main(String[] args) {
        flyweight();
        proxy();
    }


    public static void flyweight() {
        ColorFactory color = ColorFactory.instance;
        FontFactory font = FontFactory.instance;
        SizeFactory size = SizeFactory.instance;

        RichCharacter[] text;
        try {
            text = FileReading.readFile(COPY_PATH);
            FileReading.saveFile(PATH, text);

            text = FileReading.readFile(PATH);
            System.out.println("===== BEFORE =====");
            printChars(text);

            text[0].setColor(color.getColor("Red"));
            text[1].setColor(color.getColor("Red"));
            text[2].setColor(color.getColor("Red"));
            text[3].setColor(color.getColor("Red"));
            text[4].setColor(color.getColor("Red"));
            text[0].setFont(font.getFont("Calibri"));
            text[1].setFont(font.getFont("Calibri"));
            text[2].setFont(font.getFont("Calibri"));
            text[3].setFont(font.getFont("Calibri"));
            text[4].setFont(font.getFont("Calibri"));

            text[6].setColor(color.getColor("Light Blue"));
            text[7].setColor(color.getColor("Light Blue"));
            text[8].setColor(color.getColor("Light Blue"));
            text[9].setColor(color.getColor("Light Blue"));
            text[10].setColor(color.getColor("Light Blue"));
            text[6].setFont(font.getFont("Comic Sans"));
            text[7].setFont(font.getFont("Comic Sans"));
            text[8].setFont(font.getFont("Comic Sans"));
            text[9].setFont(font.getFont("Comic Sans"));
            text[10].setFont(font.getFont("Comic Sans"));
            text[6].setSize(size.getSize(32));
            text[7].setSize(size.getSize(32));
            text[8].setSize(size.getSize(32));
            text[9].setSize(size.getSize(32));
            text[10].setSize(size.getSize(32));

            text[11].setColor(color.getColor("Red"));
            text[12].setColor(color.getColor("Red"));
            text[13].setColor(color.getColor("Red"));
            text[14].setColor(color.getColor("Red"));
            text[15].setColor(color.getColor("Red"));
            text[16].setColor(color.getColor("Red"));
            text[11].setFont(font.getFont("Impact"));
            text[12].setFont(font.getFont("Impact"));
            text[13].setFont(font.getFont("Impact"));
            text[14].setFont(font.getFont("Impact"));
            text[15].setFont(font.getFont("Impact"));
            text[16].setFont(font.getFont("Impact"));
            text[11].setSize(size.getSize(40));
            text[12].setSize(size.getSize(40));
            text[13].setSize(size.getSize(40));
            text[14].setSize(size.getSize(40));
            text[15].setSize(size.getSize(40));
            text[16].setSize(size.getSize(40));

            FileReading.saveFile(PATH, text);
            System.out.println("===== AFTER =====");
            printChars(text);

            System.out.println("//////// Flyweight Pools \\\\\\\\\\\\\\\\");
            font.printPool();
            color.printPool();
            size.printPool();
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



    public static void proxy() {
        MusicService server = new MusicService();
        server.songs.add(new Song()
            .ID(0)
            .album("SqaureBoB Me Boy")
            .title("F.U.N")
            .duration(180)
        );
        server.songs.add(new Song()
            .ID(1)
            .album("SqaureBoB Me Boy")
            .title("Campfire Song")
            .duration(180)
        );
        server.songs.add(new Song()
            .ID(2)
            .album("SqaureBoB Me Boy")
            .title("Goofy Goober")
            .duration(180)
        );
        server.songs.add(new Song()
            .ID(3)
            .album("SqaureBoB Me Boy")
            .title("Garry Come Home")
            .duration(90)
        );
        server.songs.add(new Song()
            .ID(3)
            .title("Garry Come Home")
            .duration(90)
        );
        server.songs.add(new Song()
            .ID(4)
            .title("PROCRASTINATION")
            .duration(60)
        );


        ProxyMusicService proxy = new ProxyMusicService(server);

        System.out.println("===== Albumm SqaureBoB Me Boy =====");
        for (Song s : proxy.searchByAlbum("SqaureBoB Me Boy")) {
            System.out.println(s.title);
        }

        System.out.println("===== Songs titled \"Garry Come Home\" =====");
        for (Song s : proxy.searchByTitle("Garry Come Home")) {
            System.out.println(s.ID + " | " + s.title + " | " + s.album);
        }

        System.out.println("===== Songs ID 2 =====");
        System.out.println(proxy.searchById(2).title);

    }
}