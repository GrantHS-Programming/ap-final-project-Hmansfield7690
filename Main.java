import java.util.ArrayList;

public class Main {
    static ArrayList<Main> inventory = new ArrayList<>();

    //Rooms
    Room livingRoom = new Room(false, 1);
    Room kitchen = new Room(false,2);
    Room hallway = new Room(false,3);
    LockedRoom bedRoom = new LockedRoom(false,true,4);

    //Stationary Objects
    DoorLock doorLock = new DoorLock(3,true);
    Microwave microwave = new Microwave(2,false,true);
    Tv tv = new Tv(1,false,0);

    //Playwe
    Main player = new Main(1, inventory);
    public static void main(String[] args) {
    }


    public Main(int roomId, ArrayList<Main> Inventory){

    }
    public void moveRoom(int currentRoomId, int nextRoomId){
        if (!checkAdjacent(currentRoomId, nextRoomId)){
            System.out.println("You can not enter that room from your current room.");
        }
        else if(doorLock.getLocked()){
            System.out.println("That door is locked, you need a key to get in");
        }
        else {
            player.setroomId= nextRoomId;
        }
    }
    public boolean checkAdjacent(int currentRoomId, int nextRoomId){
        if (currentRoomId == 1){
            if (nextRoomId == 2){
                return true;
            }
            if (nextRoomId == 3){
                return true;
            }
            if (nextRoomId == 4){
                return false;
            }
        }
        else if (currentRoomId == 2){
            if (nextRoomId == 1){
                return true;
            }
            if (nextRoomId == 3){
                return false;
            }
            if (nextRoomId == 4){
                return false;
            }

        }
        else if (currentRoomId == 3){
            if (nextRoomId == 1){
                return true;
            }
            if (nextRoomId == 2){
                return false;
            }
            if (nextRoomId == 4){
                return true;
            }

        }
        else if (currentRoomId == 4){
            if (nextRoomId == 1){
                return false;
            }
            if (nextRoomId == 2){
                return false;
            }
            if (nextRoomId == 3){
                return true;
            }
        }
        return false;
    }

}
