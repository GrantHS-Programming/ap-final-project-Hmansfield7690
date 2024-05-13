public class DoorLock extends StationaryObjects {
    private boolean locked;
    public DoorLock(int room, boolean locked){
        super(room);
        this.locked = locked;
    }

}
