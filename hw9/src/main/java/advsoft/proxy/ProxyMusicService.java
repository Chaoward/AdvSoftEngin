package advsoft.proxy;

import java.util.List;

public class ProxyMusicService implements SongService {
    private MusicService service;

    public ProxyMusicService(MusicService service) {
        this.service = service;
    }

    @Override
    public Song searchById(Integer songID) {
        return service.searchById(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return service.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return service.searchByAlbum(album);
    }

}
