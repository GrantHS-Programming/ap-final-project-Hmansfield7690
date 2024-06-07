public class Tv extends StationaryObjects {
    private boolean isOn;
    private int channel;
    public Tv(int room, boolean isOn, int channel){
        super(room);
        this.isOn = isOn;
        this.channel = channel;
    }
    public boolean getIsOn(){
        return isOn;
    }
    public int getChannel(){
        return channel;
    }

    public void turnOn(){

        isOn = true;
    }
    public void setChannel(int futureChannel){
        channel = futureChannel;
    }
}
