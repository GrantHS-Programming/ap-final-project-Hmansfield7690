public class Room {

    private int timesEntered;
    private boolean inRoom;
    private int roomId;

    public Room (boolean inRoom, int roomId,int timesEntered){
        this.inRoom = inRoom;
        this.roomId = roomId;
        this.timesEntered = timesEntered;
    }

    public void enterCount(){
        timesEntered++;
    }
    public int getTimesEntered(){
        return timesEntered;
    }
}
