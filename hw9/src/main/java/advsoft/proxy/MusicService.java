package advsoft.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MusicService implements SongService {
    public final List<Song> songs = new ArrayList<Song>();

    @Override
    public Song searchById(Integer songID) {
        for (Song s : songs) {
            if (songID == s.ID)
                return s;
        }

        throw new NoSuchElementException();
    }

    @Override
    public List<Song> searchByTitle(String title) {
        ArrayList<Song> foundList = new ArrayList<>();

        for (Song s : songs) {
            if (title == s.title)
                foundList.add(s);
        }

        return foundList;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        ArrayList<Song> foundList = new ArrayList<>();

        for (Song s : songs) {
            if (album == s.album)
                foundList.add(s);
        }

        return foundList;
    }
    
}
