package CSE111.Theory.Assignment06;

public class Series extends Media {
    public Series() { }

    public Series(String name) {
        this(name, 0, 0);
    }

    public Series(String name, int minutesWatched, int runTime){
        super(name, minutesWatched, runTime);
    }
}
