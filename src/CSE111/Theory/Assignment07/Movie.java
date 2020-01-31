package CSE111.Theory.Assignment07;

public final class Movie extends Media {
    public Movie() { }

    public Movie(String name){
        this(name, 0, 0);
    }

    public Movie(String name, int minutesWatched, int runtime){
        super(name, minutesWatched, runtime);
    }
}
