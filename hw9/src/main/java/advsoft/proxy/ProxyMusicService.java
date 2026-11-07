package advsoft.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class ProxyMusicService implements SongService {
    private static final int CACHE_SIZE = 20;
    private MusicService service;
    private Song[] cache = new Song[CACHE_SIZE];
    private int index = 0;

    public ProxyMusicService(MusicService service) {
        this.service = service;
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            return findInCache((Song s) -> s.ID == songID);
        }
        catch (NoSuchElementException e) {
            Song trgt = service.searchById(songID);
            cache[incrementIndex()] = trgt;
            return trgt;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return service.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return service.searchByAlbum(album);
    }



    private Song findInCache(Predicate<Song> predicate) {
        for (Song s : cache) {
            if (s == null) continue;
            if (predicate.test(s))
                return s;
        }

        throw new NoSuchElementException();
    }

    private int incrementIndex() {
        index += 1;
        if (index >= CACHE_SIZE)
            index = 0;
        return index;
    }

}
