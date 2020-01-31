package CSE111.Theory.Assignment06;

public class Anime extends Media {
    public Anime() { }

    public Anime(String name) {
        this(name, 0, 0);
    }

    public Anime(String name, int minutesWatched, int runTime){
        super(name, minutesWatched, runTime);
    }
}