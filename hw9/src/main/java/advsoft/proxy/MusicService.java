package advsoft.proxy;

import java.util.ArrayList;
import java.util.List;

public class MusicService implements SongService {
    public final List<Song> songs = new ArrayList<Song>();

    @Override
    public Song searchById(Integer songID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchById'");
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchByTitle'");
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchByAlbum'");
    }
    
}
