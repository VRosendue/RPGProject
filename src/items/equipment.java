package items;
import java.util.HashMap;
import dependencies.equipment.*;


public class equipment {
	
	
	//Creating HashMap for slots
	private HashMap<piece, Item> equippable;
	
	public equipment() {
		
		equippable.put(piece.HEADPIECE, null);
		equippable.put(piece.CHESTPIECE, null);
		equippable.put(piece.LEGPIECE, null);
		equippable.put(piece.WEAPON, null);
		
	
	}



	public HashMap<piece, Item> getEquippable() {
		return equippable;
	}

	public void setEquippable(HashMap<piece, Item> equippable) {
		this.equippable = equippable;
	}
	
	

}
