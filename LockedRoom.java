public class LockedRoom extends Room {
    private boolean locked;

    public LockedRoom(boolean inRoom, boolean locked, int roomId) {
        super(inRoom,roomId);
        this.locked = locked;
    }
}
