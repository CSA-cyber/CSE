package CSE111.Theory.Assignment07;

public final class Anime extends Media {
    public Anime() { }

    public Anime(String name) {
        this(name, 0, 0);
    }

    public Anime(String name, int minutesWatched, int runTime){
        super(name, minutesWatched, runTime);
    }
}