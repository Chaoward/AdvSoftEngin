import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

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
            .title("Garry Come Home")
            .duration(90)
        );
        server.songs.add(new Song()
            .ID(4)
            .title("PROCRASTINATION")
            .duration(60)
        );

        ProxyMusicService proxy = new ProxyMusicService();

        assertArrayEquals(proxy.searchByTitle("F.U.N").toArray(), server.searchByTitle("F.U.N").toArray());
        
        assertArrayEquals(proxy.searchByAlbum("SqaureBoB Me Boy").toArray(), server.searchByAlbum("SqaureBoB Me Boy").toArray());
        
        assertEquals(proxy.searchById(2), server.searchById(2));
        assertNotEquals(proxy.searchById(0), server.searchById(4));
    }

}
