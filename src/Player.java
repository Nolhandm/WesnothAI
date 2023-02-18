import java.util.*;

public class Player {

    private List <Unit> unitList;
    private int id;
    private int nbUnits;

    public Player (int id){
        this.id = id;
        this.unitList = new ArrayList<Unit>();
        this.unitList.add(new Unit(0,0,0));
        this.nbUnits = 1;
    }

    public void recruter (Tiles tile){
        //this.unitList.add();
    }

}