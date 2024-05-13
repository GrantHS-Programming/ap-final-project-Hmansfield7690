public class Tv extends StationaryObjects {
    private boolean isOn;
    private int channel;
    public Tv(int room, boolean isOn, int channel){
        super(room);
        this.isOn = isOn;
        this.channel = channel;
    }
}
