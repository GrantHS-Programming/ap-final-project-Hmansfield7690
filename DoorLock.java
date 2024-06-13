public class DoorLock extends StationaryObjects {
    private boolean locked;
    public DoorLock(int room, boolean locked){
        super(room);
        this.locked = locked;
    }
    public boolean getLocked(){
        if (locked){
            return true;
        }
        else {
            return false;
        }
    }
    public void unlock(){
        locked = false;
    }

}
