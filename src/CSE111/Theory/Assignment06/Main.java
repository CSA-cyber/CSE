package CSE111.Theory.Assignment06;

public class Main {
    public static void main(String[] args) {
        Library<Media> mediaLibrary = new Library<>();

        Media  a = new Anime("Boku no piko");
        Media  b = new Movie("Pulp fiction");
        Series c = new Series("Dragon Ball Z");
        Media  d = new Anime("Boku no piko");

        mediaLibrary.add(a);
        mediaLibrary.add(b);
        mediaLibrary.add(c);
        mediaLibrary.add(d);
        c.delete();


        mediaLibrary.printConditionally(a);
    }
}
