import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner inputOpperator = new Scanner(System.in);
    static ArrayList<MovingObjects> inventory = new ArrayList<MovingObjects>();
    public static int roomId = 1;

    //Rooms
    Room livingRoom = new Room(false, 1);
    Room kitchen = new Room(false,2);
    Room hallway = new Room(false,3);
    LockedRoom bedRoom = new LockedRoom(false,true,4);

    //Stationary Objects
    static DoorLock doorLock = new DoorLock(3,true);
    static Microwave microwave = new Microwave(2,false,true);
    static Tv tv = new Tv(1,false,0);
    static boolean playing = true;

    //Moving Objects
    static MovingObjects remote = new MovingObjects(false);
    static MovingObjects waxBall = new MovingObjects(false);

    //Player
    public static void main(String[] args) {
        Scanner inputOpperator = new Scanner(System.in);
        while (playing) {
            System.out.println("You are currently in the " + getRoomName(roomId));
            if (roomId == 1) {
                livingRoomAction();
            }
            else if (roomId == 2) {
                kitchenAction();
            }
            else if (roomId == 3){
                hallwayAction();
            }
            else if (roomId == 4){
                bedroomAction();
            }
        }


    }


    public static void livingRoomAction(){
        System.out.println("There is a TV in the corner, but it is not turned on and the the remote is nowhere to be found. ");
        System.out.println("a) Move to the kitchen");
        System.out.println("b) Move to the halway");
        System.out.println("c) Use the TV");
        System.out.println("q) Quit");
        System.out.print("input: ");
        String action = inputOpperator.nextLine();
        if (action.equals("a")){
            roomId = 2;
        }
        else if (action.equals("b")){
            roomId = 3;
        }
        else if (action.equals("q")){
            playing = false;
        }
    }
    public static void kitchenAction(){
        System.out.println("it appears to have been looted, all that remains is a microwave");
        System.out.println("a) Move to the living room");
        System.out.println("b) Use the microwave");
        System.out.println("q) Quit");
        System.out.print("input: ");
        String action = inputOpperator.nextLine();
        if (action.equals("a")){
            roomId = 1;
        }
        else if (action.equals("q")){
            playing = false;
        }

    }
    public static void hallwayAction(){
        System.out.println("It is a rather boring passageway connecting the living room to the bedroom, a flickering light bulb hangs from the ceiling");
        System.out.println("The door to the bedroom appears to have a padlock on it. As you walk towards the door, you nearly trip on a ball of reddish wax, about ");
        System.out.println("the size of an apple");
        System.out.println("a) Move to the living room");
        System.out.println("b) Move to the bedroom");
        System.out.println("c) Examine the ball of wax");
        System.out.println("q) Quit");
        System.out.print("input: ");
        String action = inputOpperator.nextLine();
        if (action.equals("a")){
            roomId = 1;
        }
        else if (action.equals("b")){
            if (doorLock.getLocked()){
                System.out.println("The door is locked, you need a key to enter");
                hallwayAction();
            }
            else {
                roomId = 4;
            }
        }
        else if (action.equals("c")){
            holdWax();
        }
        else if (action.equals("q")){
            playing = false;
        }
    }


    public static void bedroomAction(){
        System.out.println("there is a tv remote and a combination safe sitting on the nightstand");
        System.out.println("a) Move to the hallway");
        System.out.println("b) Pick up the remote");
        System.out.println("c) Enter a passcode for the safe");
        System.out.println("q) Quit");
        System.out.print("input: ");
        String action = inputOpperator.nextLine();
        if (action.equals("a")){
            roomId = 3;
        }
        else if(action.equals("b")){
            inventory.add(remote);
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
    public static String getRoomName(int roomIdNumber){
        if (roomIdNumber == 1){
            return "Living Room";
        }
        else if (roomIdNumber == 2){
            return "Kitchen";
        }
        else if (roomIdNumber == 3){
            return "Hallway";
        }
        else {
            return "Bedroom";
        }
    }
    public static void holdWax(){
        System.out.println("What do you want to do with the wax");
        System.out.println("a) Leave it on the floor");
        System.out.println("b) Hold the ball up to the light");
        System.out.println("c) Break it open with your hands");
        System.out.println("d) Put it in your pocket");
        System.out.print("input: ");
        String waxAcction = inputOpperator.nextLine();
        if (waxAcction.equals("a")){
            System.out.println("You drop the wax");
        }
        else if(waxAcction.equals("b")){
            System.out.println("There is clearly something inside the wax");
            holdWax();
        }
        else if(waxAcction.equals("c")){
            System.out.println("You try to break it open, but your hands keep slipping");
            holdWax();
        }
        else if(waxAcction.equals("d")){
            System.out.println("You put the wax in your pocket");
            inventory.add(waxBall);
        }
    }

}
