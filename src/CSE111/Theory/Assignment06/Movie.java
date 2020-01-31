package CSE111.Theory.Assignment06;

public class Movie extends Media {
    public Movie() { }

    public Movie(String name){
        this(name, 0, 0);
    }

    public Movie(String name, int minutesWatched, int runtime){
        super(name, minutesWatched, runtime);
    }
}
