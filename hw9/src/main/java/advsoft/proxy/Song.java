package advsoft.proxy;

public class Song {
    public Integer ID = 0;
    public String title = "";
    public String album = "";
    public int duration = 0;

    public Song ID(Integer id) {
        ID = id;
        return this;
    }

    public Song title(String title) {
        this.title = title;
        return this;
    }

    public Song album(String album) {
        this.album = album;
        return this;
    }

    public Song duration(int duration) {
        this.duration = duration;
        return this;
    }
}
