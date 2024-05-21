public class LockedRoom extends Room {
    private boolean locked;

    public LockedRoom(boolean inRoom, boolean locked, int roomId,int timesEntered) {
        super(inRoom,roomId,timesEntered);
        this.locked = locked;
    }

}
