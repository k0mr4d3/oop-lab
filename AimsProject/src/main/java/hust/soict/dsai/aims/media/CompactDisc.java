package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost, director, length);
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the list");
            return;
        }
        else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is in the list, removing");
            tracks.remove(track);
        }
        else {
            return;
        }
    }

    @Override
    public int getLength() {
        int length = 0;

        for (int i=0; i<tracks.size(); ++i) {
            length += tracks.get(i).getLength();
        }

        return length;
    }
}
