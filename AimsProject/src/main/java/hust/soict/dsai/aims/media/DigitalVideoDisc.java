package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Attributes
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
        super(id, title, category, cost, director, length);
    }

    public DigitalVideoDisc(String title) {
        setTitle(title);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        setTitle(title);
        setCategory(category);
        setCost(cost);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        setTitle(title);
        setCategory(category);
        this.director = director;
        setCost(cost);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        setTitle(title);
        setCategory(category);
        this.director = director;
        this.length = length;
        setCost(cost);
        setId(nbDigitalVideoDiscs);
        nbDigitalVideoDiscs++;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
