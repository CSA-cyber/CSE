package CSE111.Lab.Week04;

public class Clock {
    private int hour;
    private int min;
    private int seconds;

    public Clock(){
        this(12,0,0);
    }

    public Clock(int hour, int min, int seconds){
        setHour(hour);
        setMin(min);
        setSeconds(seconds);
    }

    public Clock(int seconds){
        setHour((seconds/3600)%24);
        setMin((seconds/60)%60);
        setSeconds(seconds %60);
    }

    public void setClock(int seconds){
        setHour((seconds/3600)%24);
        setMin((seconds/60)%60);
        setSeconds(seconds %60);;
    }

    public int getClock(){
        return getHour()*3600 + getMin()*60+getSeconds();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = ((hour>0 || hour<24)?hour:hour%24);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = ((min>0 || min<60)?min:0);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = ((seconds>0 || seconds<60)?seconds:seconds%60);
    }

    public void tick(){
        setSeconds(this.seconds+1);
    }

    public void tickDown(){
        setSeconds(this.seconds-1);
    }

    public void addClock(Clock clock){
        setHour(clock.getHour());
        setMin(clock.getMin());
        setSeconds(clock.getSeconds());
    }

    public Clock subtractClock(Clock clock){
        Clock result=new Clock(Math.abs(this.getClock()-clock.getClock()));
        return result;
    }

    @Override
    public String toString() {
        return String.format("(%02d:%02d:%02d)",getHour(),getMin(),getSeconds());
    }
}
