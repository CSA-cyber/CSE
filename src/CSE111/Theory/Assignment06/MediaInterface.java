package CSE111.Theory.Assignment06;

public interface MediaInterface {
    String getName();
    void setName(String name);
    public int getMinutesWatched();
    public void setMinutesWatched(int minutesWatched);
    public int getRuntime();
    public void setRuntime(int runtime);
    public double getProgress();
    void setRef(Library ref);
    boolean equals(Object anObject);
    int hashCode();
    void delete();
    String toString();
}

