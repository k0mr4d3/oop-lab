package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public Disc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }
}
