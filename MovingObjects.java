public class MovingObjects {
    private boolean inPossesion;

    public MovingObjects(boolean inPossesion) {
        this.inPossesion = inPossesion;
    }

    public boolean getLocation(){
        return inPossesion;
    }

    public void pickUp(){
        inPossesion = true;
    }

    public void drop(){
        inPossesion = false;
    }
}
