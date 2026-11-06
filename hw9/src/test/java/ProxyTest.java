import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import advsoft.proxy.MusicService;
import advsoft.proxy.ProxyMusicService;
import advsoft.proxy.Song;

public class ProxyTest {

    @Test
    public void test() {
        MusicService server = new MusicService();
        server.songs.add(new Song()
            .ID(0)
            .album("SquareBoB Me Boy")
            .title("F.U.N")
            .duration(180)
        );
        server.songs.add(new Song()
            .ID(1)
            .album("SquareBoB Me Boy")
            .title("Campfire Song")
            .duration(180)
        );
        server.songs.add(new Song()
            .ID(2)
            .album("SquareBoB Me Boy")
            .title("Goofy Goober")
            .duration(180)
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

        ProxyMusicService proxy = new ProxyMusicService();

        //assertEquals( );
    }

}
