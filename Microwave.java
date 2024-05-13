import java.util.ArrayList;

public class Microwave extends StationaryObjects {
    private boolean isOpen;
    private boolean isEmpty;
    public Microwave(int room,boolean isOpen, boolean isEmpty){
        super(room);
        this.isOpen = isOpen;
        this.isEmpty = isEmpty;
    }

}
