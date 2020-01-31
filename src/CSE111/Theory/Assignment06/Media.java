package CSE111.Theory.Assignment06;

public abstract class Media implements MediaInterface {
    private String name;
    private int minutesWatched, runtime;
    private Library<Media> ref;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutesWatched() {
        return minutesWatched;
    }

    public void setMinutesWatched(int minutesWatched) {
        this.minutesWatched = minutesWatched;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public double getProgress() {
        return (double) minutesWatched/runtime;
    }

    public Library<Media> getRef() {
        return this.ref;
    }

    public void setRef(Library ref) {
        this.ref = ref;
    }

    Media(){ }

    Media(String name, int minutesWatched, int runtime){
        this.name = name;
    }

    public boolean equals(Object anObject){
        if (this == anObject)
            return true;

        if (anObject instanceof Media){
            Media aMedia = (Media)anObject;
            return this.name.equals(aMedia.name);
        }

        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public void delete() {
        ref.delete(this);
        name = null; ref = null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" name: ");
        sb.append(this.name);
        return String.format("%s\nProgress: %.2f%%\n", sb.toString(), this.getProgress() * 100);
    }
}
